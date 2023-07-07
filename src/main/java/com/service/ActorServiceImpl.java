package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.ActorDTO;
import com.entity.Actor;
import com.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository actorRepository;
	
	@Override
	public List<ActorDTO> findAll() {
		List<ActorDTO> actors = new ArrayList<>(1);
		actorRepository.findAll().forEach((actor) -> actors.add(mapToDTO(actor)));
		return actors;
	}
	
	
	@Override
	public List<ActorDTO> findActorsByFilmId(Integer filmId) {
		List<ActorDTO> actors = new ArrayList<>(1);
		actorRepository.findActorsByFilmId(filmId).forEach((actor) -> actors.add(mapToDTO(actor)));
		return actors;
	}


	private ActorDTO mapToDTO(Actor actor) {
		return new ActorDTO(actor.getActorId(), actor.getFirstName(), actor.getLastName());
	}










}
