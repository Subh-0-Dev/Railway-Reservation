package com.subh.RailwayReservation.Controller;

import com.subh.RailwayReservation.DTOs.StationDtos.StationRequestDto;
import com.subh.RailwayReservation.DTOs.TrainDtos.TrainRequestDto;
import com.subh.RailwayReservation.Services.StationServices;
import com.subh.RailwayReservation.Services.TrainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
public class TrainController {

    @Autowired
    StationServices stationServices;
    @Autowired
    TrainServices trainServices;

    @PostMapping("/addstation")
    public ResponseEntity<?> addStationData(@RequestBody StationRequestDto stationName){
        if(stationName!=null){
            return new ResponseEntity<>(stationServices.addStations(stationName), HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Something Went Wrong",HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/stations")
    public ResponseEntity<?> getStations(){
        return stationServices.getStations();
    }


    @PostMapping("/addtrain")
    public ResponseEntity<?> addTrain(@RequestBody TrainRequestDto request){
        if(request!=null){
            return new ResponseEntity<>(trainServices.addTrain(request),HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Something Went Wrong",HttpStatus.BAD_REQUEST);
    }

}
