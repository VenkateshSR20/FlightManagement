package com.example.reservation.ors.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.ors.model.FlightEntity;
import com.example.reservation.ors.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	FlightService flightservice;
	
	@RequestMapping(value="")
	public Object getFlights(){
		
				
		return flightservice.getFlights();
		
	}
	
	@PostMapping(value={"/create"})
	public void createFlights( @RequestBody FlightEntity flightEntity){
		
		flightservice.createFlights(flightEntity);
		
	}
}
