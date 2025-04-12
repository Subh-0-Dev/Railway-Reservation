package com.subh.RailwayReservation.Services;

import com.subh.RailwayReservation.DTOs.StationDtos.StationRequestDto;
import org.springframework.http.ResponseEntity;

public interface StationServices {
    public ResponseEntity<?> addStations(StationRequestDto request);
    public ResponseEntity<?> getStations();
}
