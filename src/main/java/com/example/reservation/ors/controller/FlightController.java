package com.example.reservation.ors.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.ors.model.Flight;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@RequestMapping(value="")
	public Object getFlihts(){
		
		Flight f = new Flight();
		f.setId(1);

		f.setFlightNumber(101);
		f.setFlightName("AirWays");
		return f;
	}
}
