package com.subh.RailwayReservation.Entity.Reserve;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Passengers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passengerId;
    private String passengerName;
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne
    @JoinColumn(name="PNR")
    private Reservation reservation;
}
