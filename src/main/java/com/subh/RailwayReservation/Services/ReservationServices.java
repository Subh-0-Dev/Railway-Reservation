package com.subh.RailwayReservation.Services;

import com.subh.RailwayReservation.DTOs.ReservationDtos.ReservationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationServices {
    public ResponseEntity<?> addBooking(ReservationDto reserve);
    public List<?> getTrains();
}
