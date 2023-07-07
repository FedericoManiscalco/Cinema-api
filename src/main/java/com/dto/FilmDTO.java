package com.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FilmDTO {
	
    private Integer filmId;

    private String title;

    private Integer length;

    private Double rating;

    private String image;

    private String plot;
    
    private LocalDateTime releaseDate;
     
}
