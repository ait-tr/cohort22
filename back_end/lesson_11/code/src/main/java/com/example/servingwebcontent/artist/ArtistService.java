package com.example.servingwebcontent.artist;

import com.example.servingwebcontent.genre.Genre;
import com.example.servingwebcontent.genre.GenreRepository;
import com.example.servingwebcontent.place.Place;
import com.example.servingwebcontent.place.PlaceRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
    private GenreRepository genreRepository;

    private PlaceRepository placeRepository;

    private static final ModelMapper mapper = new ModelMapper();

    @Autowired
    void setArtistRepository(ArtistRepository artistRepository)
    {
        this.artistRepository = artistRepository;
    }

    @Autowired
    void setGenreRepository(GenreRepository genreRepository)
    {
        this.genreRepository = genreRepository;
    }

    @Autowired
    public void setPlaceRepository(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
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
            //artistDTO.setGenre(artist.getGenre());

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

        Artist artist = artistRepository.findById(id).get(); // TODO: handle not found
        return mapper.map(artist, ArtistDTO.class);
    }

    public int createArtist(NewArtistDTO artistDTO)
    {
        // name, genreId
        // 1. Get Genre entity
        int genreId = artistDTO.getGenreId();
        Genre genre = genreRepository.findById(genreId).get(); // TODO: handle errors

        // 2. Create entity Artist
        Artist artist = new Artist();

        artist.setName(artistDTO.getName());

        // 3. Add relation
        artist.setGenre(genre);

        // 3. Save to database
        return  artistRepository.save(artist).getId();
    }

    public void deleteArtist(int id)
    {
        // Remove from DB
        artistRepository.deleteById(id);
    }

    // Swagger(request UPDATE) -> Controller -> Service -> Repository -> Database
    public void updateArtist(int id, ArtistDTO artistDTO)
    {
        //artistRepository.

        // Get from database
        Artist artist = artistRepository.findById(id).get(); // TODO: handle not found
        // Update values
        artist.setName(artistDTO.getName());
        //artist.setGenre(artistDTO.getGenre());

        // Save to the database
        artistRepository.save(artist);
    }

    public List<ArtistDTO> getArtistByPlaceId(int placeId)
    {
        Place place = placeRepository.findById(placeId).get();

        // Many-to-many -> getArtists()
        List<Artist> artistsForPlace = place.getArtists();
        List<ArtistDTO> result = mapper.map(artistsForPlace, new TypeToken<List<ArtistDTO>>(){}.getType());
        return result;
    }
}
