package com.subh.RailwayReservation.ServiceImpl;

import com.subh.RailwayReservation.DTOs.ReservationDtos.PassengerDto;
import com.subh.RailwayReservation.DTOs.ReservationDtos.ReservationDto;
import com.subh.RailwayReservation.DTOs.ReservationDtos.ReservationResponseDto;
import com.subh.RailwayReservation.DTOs.TrainDtos.AllTrainDto;
import com.subh.RailwayReservation.Entity.Admin.Train;
import com.subh.RailwayReservation.Entity.Reserve.Passengers;
import com.subh.RailwayReservation.Entity.Reserve.Reservation;
import com.subh.RailwayReservation.Repository.ReservationRepository;
import com.subh.RailwayReservation.Repository.TrainRepository;
import com.subh.RailwayReservation.Services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystemImpl implements ReservationServices {

    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    TrainRepository trainRepository;

    @Override
    public ResponseEntity<?> addBooking(ReservationDto reserve) {
        Reservation reservation=new Reservation();
        Long lastPNR = reservationRepository.findTopByOrderByPNRDesc()
                .map(Reservation::getPNR)
                .orElse(1000000000L - 1);
        reservation.setPNR(lastPNR + 1);
        reservation.setReservationDate(reserve.getReservationDate());
        reservation.setJourneyDate(reserve.getJourneyDate());
        reservation.setTrainId(reserve.getTrainId());
        reservation.setTrainName(reserve.getTrainName());
        reservation.setPaymentMode(reserve.getPaymentMode());

        List<Passengers> passengersList=new ArrayList<>();
        for(PassengerDto passengers:reserve.getPassengersList()){
            Passengers pass=new Passengers();
            pass.setPassengerName(passengers.getPassengerName());
            pass.setAge(passengers.getAge());
            pass.setGender(passengers.getGender());
            pass.setReservation(reservation);
            passengersList.add(pass);
        }
        reservation.setPassengersList(passengersList);
        reservationRepository.save(reservation);
        return new ResponseEntity<>(new ReservationResponseDto(reservation.getPNR(),reservation.getJourneyDate()), HttpStatus.CREATED);
    }

    @Override
    public List<?> getTrains() {
        List<AllTrainDto> trainList=new ArrayList<>();
        for(Train train:trainRepository.findAll()){
            AllTrainDto onetrain=new AllTrainDto();
            onetrain.setTrainId(train.getTrainId());
            onetrain.setTrainName(train.getTrainName());
            trainList.add(onetrain);
        }
        return trainList;
    }
}
