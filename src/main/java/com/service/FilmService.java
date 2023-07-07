package com.service;

import java.util.List;

import com.dto.FilmDTO;

public interface FilmService {
	
	public List<FilmDTO> findAll();
	
	public List<FilmDTO> findTop5ByOrderByReleaseDateDesc();
}
