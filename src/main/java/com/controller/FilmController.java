package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.FilmDTO;
import com.service.FilmService;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/findAllFilms")
	public List<FilmDTO> findAll() {
		return filmService.findAll();
	}
	
	@GetMapping("/findTop5ByOrderByReleaseDateDesc")
	public List<FilmDTO> findTop5ByOrderByReleaseDateDesc() {
		return filmService.findTop5ByOrderByReleaseDateDesc();
	}
	
}
