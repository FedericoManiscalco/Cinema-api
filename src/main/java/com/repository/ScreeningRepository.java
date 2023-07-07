package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dto.FilmScreeningDTO;

import com.entity.Screening;

public interface ScreeningRepository extends JpaRepository<Screening, Integer> {
	
	@Query("SELECT new com.dto.FilmScreeningDTO(f.filmId, f.title, s.time) FROM Screening s JOIN s.film f WHERE s.isBookable = true")
	public List<FilmScreeningDTO> findAllByIsBookableTrue();
	
	
}
