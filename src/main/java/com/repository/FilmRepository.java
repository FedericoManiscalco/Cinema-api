package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Integer>{
	public List<Film> findTop5ByOrderByReleaseDateDesc();
}
