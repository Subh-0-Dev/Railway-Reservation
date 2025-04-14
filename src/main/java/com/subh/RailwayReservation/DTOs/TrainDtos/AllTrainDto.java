package com.subh.RailwayReservation.DTOs.TrainDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllTrainDto {
    private int trainId;
    private String trainName;
}
