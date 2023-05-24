package com.example.servingwebcontent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity // table in db
public class Artist {

    Artist(String name, String genre)
    {
        this.name = name;
        this.genre = genre;
    }

    @Id
    @GeneratedValue
    private int id; // column - id - primary key
    private String name; // column - name
    private String genre; // column - genre;
}
