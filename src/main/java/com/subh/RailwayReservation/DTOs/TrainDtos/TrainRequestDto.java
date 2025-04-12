package com.subh.RailwayReservation.DTOs.TrainDtos;

import lombok.Data;

import java.util.List;

@Data
public class TrainRequestDto {
    private String trainName;
    private String sourceStation;
    private String DestinationStation;
    private List<RouteRequestDto> route;
}
