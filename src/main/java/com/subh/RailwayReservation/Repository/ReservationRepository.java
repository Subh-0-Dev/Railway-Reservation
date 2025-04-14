package com.subh.RailwayReservation.Repository;

import com.subh.RailwayReservation.Entity.Reserve.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    Optional<Reservation> findTopByOrderByPNRDesc();
}
