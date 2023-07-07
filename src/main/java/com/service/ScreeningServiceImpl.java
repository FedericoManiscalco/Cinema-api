package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.FilmScreeningDTO;

import com.repository.ScreeningRepository;

@Service
public class ScreeningServiceImpl implements ScreeningService {

	@Autowired
	private ScreeningRepository screeningRepository;
	
	@Override
	public List<FilmScreeningDTO> findAllByIsBookableTrue() {		
		return screeningRepository.findAllByIsBookableTrue();
	}
	



}
