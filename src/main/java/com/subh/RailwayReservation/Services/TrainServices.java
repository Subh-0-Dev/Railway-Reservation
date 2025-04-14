package com.subh.RailwayReservation.Services;

import com.subh.RailwayReservation.DTOs.TrainDtos.TrainRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrainServices {
    public ResponseEntity<?> addTrain(TrainRequestDto request);

    public List<?> alltrains();
}
