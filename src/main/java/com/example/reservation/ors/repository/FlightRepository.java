package com.example.reservation.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reservation.ors.model.FlightEntity;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity,Integer>{
	

}
