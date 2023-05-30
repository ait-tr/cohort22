package com.example.servingwebcontent.artist;

import org.modelmapper.ModelMapper;
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
    private static final ModelMapper mapper = new ModelMapper();

    @Autowired
    void setArtistRepository(ArtistRepository artistRepository)
    {
        this.artistRepository = artistRepository;
    }

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

    // Request: Swagger(GET) -> Controller -> Service -> Repository -> DB(get out Entity)
    // Response: Entity -> DTO -> Swagger
    public ArtistDTO getArtist(int id)
    {
        // Get from database

        // Equal for
        // Optional<Artist> artistOpt = artistRepository.findById(id);
        // Artist artist = artistOpt.get();

        Artist artist = artistRepository.findById(id).get(); // TODO: handle not found

        // Copy data from Entity(db) to ArtistDTO(presentation layer)
        ArtistDTO result = new ArtistDTO();
        result.setName(artist.getName());
        result.setGenre(artist.getGenre());

        return result;
    }

    public int createArtist(ArtistDTO artistDTO)
    {
        // ArtistDTO(dto) -> Artist(Entity)
        Artist artist = mapper.map(artistDTO, Artist.class);
        // artist ID==0 Id not selected

        // Save to database
        // Generated new ID. 1
        Artist saved = artistRepository.save(artist); // New id generated here

        // saved now have a real

        // Return ID
        return saved.getId();
    }

    public void deleteArtist(int id)
    {
        // Remove from DB
        artistRepository.deleteById(id);
    }

    // Swagger(request UPDATE) -> Controller -> Service -> Repository -> Database
    public void updateArtist(int id, ArtistDTO artistDTO)
    {
        // Get from database
        Artist artist = artistRepository.findById(id).get(); // TODO: handle not found
        // Update values
        artist.setName(artistDTO.getName());
        artist.setGenre(artistDTO.getGenre());

        // Save to the database
        artistRepository.save(artist);
    }
}
