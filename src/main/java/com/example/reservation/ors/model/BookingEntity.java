package com.example.reservation.ors.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class BookingEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	//@Column(name="UserId")
	@OneToOne
	@JoinColumn(name="userId")
	private UserEntity userEntity;//because it maps to user so return type is "UserEntity"
	@Column(name="BookingDate")
	private Date bookingDate;
	@Column(name="TravellingDate")
	private Date travellingDate;
	//@Column(name="FlightNumber")
	@OneToOne
	@JoinColumn(name="flightId")//For class it should be @JoinColumn and not @Column-creating the column name "flightId"
	private FlightEntity flightEntity;//1booking - 1 flightnum
	@Column(name="FinancialInstrument")
	private String financialInstrument;
	@Column(name="TotalAmount")
	private float totalAmount;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getFinancialInstrument() {
		return financialInstrument;
	}
	public void setFinancialInstrument(String financialInstrument) {
		this.financialInstrument = financialInstrument;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
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
	public FlightEntity getFlightEntity() {
		return flightEntity;
	}
	public void setFlightEntity(FlightEntity flightEntity) {
		this.flightEntity = flightEntity;
	}
	//It was looking for flightNumber , we changed to flightEntity, inside flightEntity we have flightNumber
	
}
