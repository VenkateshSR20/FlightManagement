package com.example.reservation.ors;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrsApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(OrsApplication.class, args);
		System.out.println("Hello");
	}

}

