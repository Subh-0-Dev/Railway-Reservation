package com.subh.RailwayReservation.ServiceImpl;

import com.subh.RailwayReservation.DTOs.StationDtos.StationRequestDto;
import com.subh.RailwayReservation.DTOs.StationDtos.StationResponseDto;
import com.subh.RailwayReservation.Entity.TrainStation;
import com.subh.RailwayReservation.Repository.TrainStationRepository;
import com.subh.RailwayReservation.Services.StationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class StationServiceImpl implements StationServices {

    @Autowired
    TrainStationRepository stationRepository;

    @Override
    public ResponseEntity<?> addStations(StationRequestDto request) {
        TrainStation station=new TrainStation();
        if(stationRepository.findByStationName(request.getStationName()).isPresent()){
            return new ResponseEntity<>("User Already Exists", HttpStatus.CONFLICT);
        }
        station.setStationName(request.getStationName());
        TrainStation CreatedStation = stationRepository.save(station);
        return new ResponseEntity<>(new StationResponseDto(CreatedStation.getStationId(),CreatedStation.getStationName()),HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> getStations() {
        return new ResponseEntity<>(stationRepository.findAll(),HttpStatus.FOUND);
    }
}
