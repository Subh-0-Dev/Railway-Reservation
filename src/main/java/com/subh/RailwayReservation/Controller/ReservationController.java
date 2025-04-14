package com.subh.RailwayReservation.Controller;

import com.subh.RailwayReservation.DTOs.ReservationDtos.ReservationDto;
import com.subh.RailwayReservation.Services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ReservationController {

    @Autowired
    ReservationServices reservationServices;

    @PostMapping("/book")
    public ResponseEntity<?> BookMovie(ReservationDto request){
        if(request==null){
            return new ResponseEntity<>("Enter Valid Data", HttpStatus.BAD_REQUEST);
        }
        return reservationServices.addBooking(request);
    }

    @GetMapping("/trains")
    public ResponseEntity<?> getTrain(){
        return new ResponseEntity<>(reservationServices.getTrains(),HttpStatus.FOUND);
    }
}
