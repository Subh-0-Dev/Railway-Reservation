package com.subh.RailwayReservation.Entity.Admin;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainId;
    private String trainName;
    private String sourceStation;
    private String DestinationStation;

    @OneToMany(mappedBy = "train", cascade=CascadeType.ALL)
    private List<TrainRoutes> routes;
}
