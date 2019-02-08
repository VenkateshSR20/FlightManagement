package com.example.reservation.ors.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "FLIGHT")
public class FlightEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name="FLIGHT_NUM")
	private int flightNumber;
	@Column(name="FLIGHT_NAME")
	private String flightName;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	
}
