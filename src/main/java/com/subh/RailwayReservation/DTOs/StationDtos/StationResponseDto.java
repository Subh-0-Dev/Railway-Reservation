package com.subh.RailwayReservation.DTOs.StationDtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StationResponseDto {
    private int stationId;
    private String stationName;
}
