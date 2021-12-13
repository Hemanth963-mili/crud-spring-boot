package com.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.entity.TicketBooking;

public interface ITbRepo extends JpaRepository<TicketBooking, Integer>{

}
