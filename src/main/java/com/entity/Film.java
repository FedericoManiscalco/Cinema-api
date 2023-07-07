package com.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Integer filmId;

    @Column(name = "title")
    private String title;

    @Column(name = "length")
    private Integer length;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "image")
    private String image;

    @Column(name = "plot")
    private String plot;
    
    @Column(name = "release_date")
    private LocalDateTime releaseDate;
    
    @ManyToMany
    @JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "film_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actors;

	public Film(Integer filmId, String title, Integer length, Double rating, String image, String plot) {
		this.filmId = filmId;
		this.title = title;
		this.length = length;
		this.rating = rating;
		this.image = image;
		this.plot = plot;
	}
    
    
    
    
}