package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.FilmScreeningDTO;
import com.service.ScreeningService;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class ScreeningController {
	@Autowired
	private ScreeningService screeningService;
	
	@GetMapping("/findAllByIsBookableTrue")
	public List<FilmScreeningDTO> findAllByIsBookableTrue() {
		return screeningService.findAllByIsBookableTrue();
	}
	
	
}
