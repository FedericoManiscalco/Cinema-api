package com.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BookingDTO {

    private String firstName;

    private String lastName;

    private Integer numTickets;
    
    private Integer screeningId; 
}
