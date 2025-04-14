package com.subh.RailwayReservation.DTOs.ReservationDtos;

import com.subh.RailwayReservation.Entity.Reserve.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class PassengerDto {
    private int passengerId;
    private String passengerName;
    private int age;
    private Gender gender;
}
