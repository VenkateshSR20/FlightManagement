package com.example.reservation.ors.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class UserEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name = "USER_NAME")
	private String userName;
	
	
	
	public UserEntity() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
