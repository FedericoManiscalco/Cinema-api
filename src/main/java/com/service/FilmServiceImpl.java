package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dto.FilmDTO;

import com.entity.Film;
import com.repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmRepository filmRepository;

	@Override
	public List<FilmDTO> findAll() {
		List<FilmDTO> films = new ArrayList<>(1);
		filmRepository.findAll().forEach((film) -> films.add(mapToDTO(film)));
		return films;
	}
	@Override
	public List<FilmDTO> findTop5ByOrderByReleaseDateDesc() {
		List<FilmDTO> films = new ArrayList<>(1);
		filmRepository.findTop5ByOrderByReleaseDateDesc().forEach((film) -> films.add(mapToDTO(film)));
		return films;
	}
	
	private FilmDTO mapToDTO(Film film) {
		return new FilmDTO(film.getFilmId(), film.getTitle(), film.getLength(), film.getRating(), film.getImage(), film.getPlot(), film.getReleaseDate());
	}

	 
	
}
