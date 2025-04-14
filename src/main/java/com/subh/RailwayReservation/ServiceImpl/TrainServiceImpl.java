package com.subh.RailwayReservation.ServiceImpl;

import com.subh.RailwayReservation.DTOs.TrainDtos.RouteRequestDto;
import com.subh.RailwayReservation.DTOs.TrainDtos.TrainRequestDto;
import com.subh.RailwayReservation.Entity.Admin.Train;
import com.subh.RailwayReservation.Entity.Admin.TrainRoutes;
import com.subh.RailwayReservation.Repository.TrainRepository;
import com.subh.RailwayReservation.Services.TrainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class TrainServiceImpl implements TrainServices {

    @Autowired
    TrainRepository trainRepository;

    @Override
    public ResponseEntity<?> addTrain(TrainRequestDto request) {
        Train train=new Train();
        train.setTrainName(request.getTrainName());
        train.setSourceStation(request.getSourceStation());
        train.setDestinationStation(request.getDestinationStation());
        List<TrainRoutes> routeList=new ArrayList<>();
        for(RouteRequestDto route:request.getRoute()){
            TrainRoutes trainRoute=new TrainRoutes();
            trainRoute.setStationId(route.getStationId());
            trainRoute.setStationName(route.getStationName());
            trainRoute.setStopNumber(route.getStopNumber());
            trainRoute.setArrivalTime(route.getArrivalTime());
            trainRoute.setDepartureTime(route.getDepartureTime());
            trainRoute.setHaltMinutes(route.getHaltMinutes());
            trainRoute.setTrain(train);
            routeList.add(trainRoute);
        }
        train.setRoutes(routeList);

        trainRepository.save(train);
        return new ResponseEntity<>(train.getTrainName()+" Added Succesfully", HttpStatus.CREATED);
    }
}
