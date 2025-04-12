package com.subh.RailwayReservation.Repository;

import com.subh.RailwayReservation.Entity.TrainStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainStationRepository extends JpaRepository<TrainStation,Integer> {
    public Optional<TrainStation> findByStationName(String stationName);
}
