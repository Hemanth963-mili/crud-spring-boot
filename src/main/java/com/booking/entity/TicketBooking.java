package com.booking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket-Booking")
public class TicketBooking {
    
	
	
	@Id
	@GeneratedValue
	private Integer id;
	private String travel;
    private String from, to;
	
	public TicketBooking(Integer id, String travel, String from, String to) {
		super();
		this.id = id;
		this.travel = travel;
		this.from = from;
		this.to = to;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTravel() {
		return travel;
	}

	public void setTravel(String travel) {
		this.travel = travel;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
