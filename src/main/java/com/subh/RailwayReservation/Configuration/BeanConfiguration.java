package com.subh.RailwayReservation.Configuration;

import com.subh.RailwayReservation.ServiceImpl.StationServiceImpl;
import com.subh.RailwayReservation.ServiceImpl.TrainServiceImpl;
import com.subh.RailwayReservation.Services.StationServices;
import com.subh.RailwayReservation.Services.TrainServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public StationServices setStations(){
        return new StationServiceImpl();
    }

    @Bean
    public TrainServices setTrain(){
        return new TrainServiceImpl();
    }
}
