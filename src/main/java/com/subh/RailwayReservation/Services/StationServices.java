package com.subh.RailwayReservation.Services;

import com.subh.RailwayReservation.DTOs.StationDtos.StationRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface StationServices {
    public ResponseEntity<?> addStations(StationRequestDto request);
    public ResponseEntity<?> getStations();
}
