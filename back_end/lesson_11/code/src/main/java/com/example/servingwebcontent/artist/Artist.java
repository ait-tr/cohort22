package com.example.servingwebcontent.artist;

import com.example.servingwebcontent.event.Event;
import com.example.servingwebcontent.genre.Genre;
import com.example.servingwebcontent.place.Place;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @OneToMany(mappedBy = "artist") // field artist in entity Event
    private List<Event> events;     // getEvents() setEvents()


    @ManyToMany
    @JoinTable(
            name = "event",
            joinColumns = @JoinColumn(name = "artist_ref_id"),
            inverseJoinColumns = @JoinColumn(name = "place_id")
    )
    private List<Place> places;
}

// Artist artist = repository.findById(artistId);
// List<Event> eventsForArtist = artist.getEvents();
//