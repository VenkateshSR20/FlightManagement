package com.example.reservation.ors.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservation.ors.model.BookingEntity;
import com.example.reservation.ors.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository bookingRepository;
	public List<BookingEntity> getBooking() {
		
		return bookingRepository.findAll();
	}
	
	public BookingEntity getBooking(int bookingId){
		return bookingRepository.findById(bookingId).get();
	}
	
	public void setBooking(BookingEntity bookingEntity, boolean isBooking) {
		bookingEntity.setBookingDate(new Date());
		if(isBooking){
			bookingEntity.setStatus("A");
		}else{
			bookingEntity.setStatus("I");
		}
		 bookingRepository.save(bookingEntity);
		 
	}
}
