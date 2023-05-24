package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
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
    private ArtistRepository artistRepository;

    @Autowired
    void setArtistRepository(ArtistRepository artistRepository)
    {
        this.artistRepository = artistRepository;
    }

    static final ArrayList<ArtistDTO> ARTIST_DTOS = new ArrayList<ArtistDTO>(){{
        add(new ArtistDTO("Metallica", "Heavy metal"));
        add(new ArtistDTO("Chvrches", "Synth-Pop"));
    }};

    public List<ArtistDTO> artistList()
    {

        // Get all entity from DB table.
        Iterable<Artist> all = artistRepository.findAll();

        // Copy data from Enities to DTOs
        List<ArtistDTO> result = new ArrayList<ArtistDTO>();
        for (Artist artist : all)
        {
            ArtistDTO artistDTO = new ArtistDTO();
            artistDTO.setName(artist.getName());
            artistDTO.setGenre(artist.getGenre());

            // Add to list
            result.add(artistDTO);
        }
        return result;
    }

    // HOMEWORK getById, update, delete

    // HOMEWORK
    public ArtistDTO getAtrist(int id)
    {
        return ARTIST_DTOS.get(id);
    }

    public void createArtist(ArtistDTO artistDTO)
    {
        // Save DTO in Entity
        Artist artist = new Artist(artistDTO.getName(), artistDTO.getGenre());

        // Save to database
        artistRepository.save(artist);
    }
}
