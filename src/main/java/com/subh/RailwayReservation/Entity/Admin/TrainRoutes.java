package com.subh.RailwayReservation.Entity.Admin;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@Entity
public class TrainRoutes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RouteId;

    @ManyToOne
    @JoinColumn(name = "trainId")
    @JsonBackReference
    private Train train;

    private int stationId;
    private String stationName;

    private int stopNumber;
    private LocalTime arrivalTime;
    private LocalTime departureTime;

    private int haltMinutes;

}
