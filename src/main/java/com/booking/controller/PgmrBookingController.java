package com.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.service.BookingService;
import com.pgm.to.BookingTO;

@RestController
@RequestMapping("/booking")
public class PgmrBookingController {
	
	@Autowired
	BookingService bookingService;
		
	@PostMapping("/save")
	public BookingTO save(@RequestBody BookingTO booking) {
		return bookingService.save(booking);
	}
	
	@GetMapping("/findAll")
	public List<BookingTO> findAll() {
		return bookingService.findAll();
	}

}
