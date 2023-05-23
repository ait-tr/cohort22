package com.example.servingwebcontent;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// TODO:
// 1. Rename Artist to ArtistDTO
// 2. Create Artist - Entity(name, genre, id). @Entity, @Id, GeneratedValue
// 3. Create repository interface
// 3. Add artistRepository to ArtistService
// 4. Add to ArtistService. methods createArtist, getArtists works with artistRepository(save and findAll)

@Service
public class ArtistService {
    static final ArrayList<Artist> ARTISTS = new ArrayList<Artist>(){{
        add(new Artist("Metallica", "Heavy metal"));
        add(new Artist("Chvrches", "Synth-Pop"));
    }};

    public List<Artist> artistList()
    {
        return ARTISTS;
    }

    public Artist getAtrist(int id)
    {
        return ARTISTS.get(id);
    }
}
