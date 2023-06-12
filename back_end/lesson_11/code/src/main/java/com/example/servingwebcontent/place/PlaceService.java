package com.example.servingwebcontent.place;

import com.example.servingwebcontent.artist.Artist;
import com.example.servingwebcontent.artist.ArtistRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    private PlaceRepository placeRepository;
    private ArtistRepository artistRepository;

    // DTO -> Entity
    // Entity -> DTO
    private static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public void setPlaceRepository(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public int createPlace(NewPlaceDTO newPlaceDTO)
    {
        // Data from newPlaceDTO -> place
        Place place = modelMapper.map(newPlaceDTO, Place.class);

        // save *entity* to database and return ID
        return placeRepository.save(place).getId();
    }

    public PlaceDTO getPlace(int id)
    {
        //placeRepository.findByCity()

        // Get Place(Entity) from database (using repository)
        Place place = placeRepository.findById(id).get(); // TODO: handle not found
        // map from Enity to DTO
        PlaceDTO result = modelMapper.map(place, PlaceDTO.class);
        return result;
    }

    public List<PlaceDTO> getPlacesByArtistId(int artistId)
    {
        Artist artist = artistRepository.findById(artistId).get();
        List<Place> placesForArtist = artist.getPlaces();
        return modelMapper.map(placesForArtist, new TypeToken<List<PlaceDTO>>(){}.getType());
    }


    public List<PlaceDTO> getPlacesByCityName(String city)
    {
        List<Place> places = placeRepository.findByCity(city);
        return modelMapper.map(places, new TypeToken<List<PlaceDTO>>(){}.getType());
    }

    public List<PlaceDTO> getPlacesByCityWithAddress(String city, String address)
    {
        List<Place> places = placeRepository.findByCityOrAddress(city, address);
        return modelMapper.map(places, new TypeToken<List<PlaceDTO>>(){}.getType());
    }
}
