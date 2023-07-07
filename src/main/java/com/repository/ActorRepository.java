package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer>{
	
	@Query("SELECT a FROM Actor a JOIN a.films f WHERE f.filmId = :filmId")
	public List<Actor> findActorsByFilmId(Integer filmId);

} 

 