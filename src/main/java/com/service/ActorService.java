package com.service;

import java.util.List;

import com.dto.ActorDTO;

public interface ActorService {
	
	public List<ActorDTO> findAll();
	
	public List<ActorDTO> findActorsByFilmId(Integer filmId);
}
