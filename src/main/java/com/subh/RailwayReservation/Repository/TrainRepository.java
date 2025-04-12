package com.subh.RailwayReservation.Repository;

import com.subh.RailwayReservation.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer>{
}
