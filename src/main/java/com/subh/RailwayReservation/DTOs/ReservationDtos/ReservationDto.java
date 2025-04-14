package com.subh.RailwayReservation.DTOs.ReservationDtos;

import com.subh.RailwayReservation.Entity.Reserve.Passengers;
import com.subh.RailwayReservation.Entity.Reserve.Payment;
import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ReservationDto {
    private LocalDate reservationDate;
    private LocalDate journeyDate;
    private int trainId;
    private String trainName;
    private Payment paymentMode;
    private List<PassengerDto> passengersList;
}
