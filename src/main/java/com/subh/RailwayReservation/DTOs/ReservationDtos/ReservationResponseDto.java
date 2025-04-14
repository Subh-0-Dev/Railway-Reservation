package com.subh.RailwayReservation.DTOs.ReservationDtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ReservationResponseDto {
    private Long PNR;
    private LocalDate JourneyDate;
}
