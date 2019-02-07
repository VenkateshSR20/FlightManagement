package com.example.reservation.ors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.reservation.ors.model.FlightEntity;
import com.example.reservation.ors.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired 
	FlightRepository flightRepository;
	public List<FlightEntity> getFlights() {
		
		return flightRepository.findAll();
		
	}
	
	public void createFlights(FlightEntity flightEntity) {
		flightRepository.save(flightEntity);
	}
	
	//Add the function with getFlight(int flightID)
}
