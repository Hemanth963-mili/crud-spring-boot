package com.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.booking.dao.ITbRepo;
import com.booking.entity.TicketBooking;

public class TbService {
	
	@Autowired
	private ITbRepo irepo;
	
	public List<TicketBooking> listAllCustomers() {
        return irepo.findAll();
    }
	
	public TicketBooking getCustomer(Integer id) {
        return irepo.findById(id).get();
    }
	
	public void saveCustomer(TicketBooking t) {
        irepo.save(t);
    }
	
	public void deleteCustomer(Integer id) {
        irepo.deleteById(id);
    }
	
	
	
	

}
