package com.example.reservation.ors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reservation.ors.model.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Integer>{

}
