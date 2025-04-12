package com.subh.RailwayReservation.DTOs.TrainDtos;

import lombok.Data;

import java.time.LocalTime;

@Data
public class RouteRequestDto {
    private int stationId;
    private String stationName;

    private int stopNumber;
    private LocalTime arrivalTime;
    private LocalTime departureTime;

    private int haltMinutes;
}
