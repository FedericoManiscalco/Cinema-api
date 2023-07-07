package com.service;

import java.util.List;

import com.dto.FilmScreeningDTO;


public interface ScreeningService {
	public List<FilmScreeningDTO> findAllByIsBookableTrue();
}
