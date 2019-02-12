package com.example.reservation.ors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.ors.model.BookingEntity;
import com.example.reservation.ors.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	BookingService bookingservice;
	
	@RequestMapping(value="")
	public Object getBooking() {
		
		return bookingservice.getBooking();
	}
	
	@RequestMapping(value="/{bookingId}")
	public Object getBookingById(@PathVariable int bookingId) {
		
		return bookingservice.getBooking(bookingId);
	}
	
	@PostMapping(value={"/save/{isBooking}"})
	public void setBooking(@RequestBody BookingEntity bookingEntity, @PathVariable boolean isBooking){
		
		bookingservice.setBooking(bookingEntity,isBooking);
	}
}
