package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.BookingDTO;
import com.service.BookingService;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/saveBooking")
	public BookingDTO save(@RequestBody BookingDTO bookingDTO) {
		System.out.println(bookingDTO);
		return bookingService.save(bookingDTO);
	}
}
