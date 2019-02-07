package com.example.reservation.ors.model;

import java.util.Date;

public class ReschedulingEntity {

	private int userId;
	private Date bookingDate;
	private Date travellingDate;
	private String flightNumber;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getTravellingDate() {
		return travellingDate;
	}
	public void setTravellingDate(Date travellingDate) {
		this.travellingDate = travellingDate;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	
}
