package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.BookingDTO;
import com.entity.Booking;
import com.entity.Screening;
import com.repository.BookingRepository;
import com.repository.ScreeningRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private ScreeningRepository screeningRepository;

	@Override
	public BookingDTO save(BookingDTO bookingDTO) {
		Integer screeningId = bookingDTO.getScreeningId();
		Optional<Screening> screening = screeningRepository.findById(screeningId);
		Booking b = new Booking();
		b.setFirstName(bookingDTO.getFirstName());
		b.setLastName(bookingDTO.getLastName());
		b.setNTickets(bookingDTO.getNumTickets());
		b.setScreening(screening.get());
		bookingRepository.save(b);
		System.out.println(bookingDTO);
		return bookingDTO;
	}

}
