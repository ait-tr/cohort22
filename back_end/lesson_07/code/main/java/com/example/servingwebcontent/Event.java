package com.example.servingwebcontent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // jakarta.persistence
@AllArgsConstructor // lombok
@NoArgsConstructor  //
@Getter
@Setter
public class Event {
    @GeneratedValue // jakarta.persistence
    @Id // jakarta.persistence
    private int id;
    private String name;
    private String city;
}
