package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ActorDTO;
import com.service.ActorService;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class ActorController {
	
	@Autowired
	private ActorService actorService;
	
	@GetMapping("/findAllActors")
	public List<ActorDTO> findAll() {
		return actorService.findAll();
	}
	
	@GetMapping("/findActorsByFilmId/{filmId}")
	public List<ActorDTO> findActorsByFilmId(@PathVariable int filmId) {
		return actorService.findActorsByFilmId(filmId);
	}
	
}
