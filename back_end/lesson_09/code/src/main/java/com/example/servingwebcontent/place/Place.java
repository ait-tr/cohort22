package com.example.servingwebcontent.place;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Place {
    // id
    @Id // - primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id generated auto (MySQL auto_increment)
    private int id;

    // name
    @NotNull // (MySQL: not null)
    private String name;

    // address
    @NotNull // (MySQL: not null)
    private String address;

    // city
    @NotNull
    private String city;
}
