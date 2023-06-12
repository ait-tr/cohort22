package com.example.servingwebcontent.place;

import com.example.servingwebcontent.artist.Artist;
import com.example.servingwebcontent.event.Event;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    // getEvents() -
    @OneToMany(mappedBy = "place") // place field in Event
    private List<Event> events;

    @ManyToMany(mappedBy = "places")
    private List<Artist> artists;

}

// place.getArtists()