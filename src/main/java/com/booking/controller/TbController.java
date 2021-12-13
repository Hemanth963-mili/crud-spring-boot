package com.booking.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entity.TicketBooking;
import com.booking.service.TbService;

@RestController
@RequestMapping("/customers")
public class TbController {
	
	@Autowired
	private TbService tservice;
	
	 @GetMapping("")
	 public List<TicketBooking> list() {
	        return tservice.listAllCustomers();
	 }
	 
	 @GetMapping("/{id}")
	    public ResponseEntity<TicketBooking> get(@PathVariable Integer id) {
	        try {
	            TicketBooking t = tservice.getCustomer(id);
	            return new ResponseEntity<TicketBooking>(t, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<TicketBooking>(HttpStatus.NOT_FOUND);
	        }
	    }
	 
	 @PostMapping("/")      
	 public void add(@RequestBody TicketBooking t) {
	        tservice.saveCustomer(t);
	 }
	 
	 @PutMapping("/{id}")
	    public ResponseEntity<?> update(@RequestBody TicketBooking t, @PathVariable Integer id) {
	        try {
	            TicketBooking existCustomer = tservice.getCustomer(id);
	            t.setId(id);
	            tservice.saveCustomer(t);
	            return new ResponseEntity(HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity(HttpStatus.NOT_FOUND);
	        }
	    }
	 
	 @DeleteMapping("/{id}")
	    public void delete(@PathVariable Integer id) {

	        tservice.deleteCustomer(id);
	    }
	
	

}
