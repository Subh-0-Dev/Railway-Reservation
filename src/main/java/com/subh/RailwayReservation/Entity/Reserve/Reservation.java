package com.subh.RailwayReservation.Entity.Reserve;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Reservation {
    @Id
    private Long PNR;
    private LocalDate reservationDate;
    private LocalDate journeyDate;
    private int trainId;
    private String trainName;

    @Enumerated(EnumType.STRING)
    private Payment paymentMode;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<Passengers> passengersList;
}
