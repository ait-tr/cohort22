package com.example.servingwebcontent.artist;

import com.example.servingwebcontent.genre.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity // table in db - artist
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int id; // column - id - primary key

    private String name; // column - name


    @ManyToOne
    private Genre genre;  // column - genre_id - owner
}
