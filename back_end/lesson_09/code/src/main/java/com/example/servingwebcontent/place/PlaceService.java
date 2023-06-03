package com.example.servingwebcontent.place;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

    private PlaceRepository placeRepository;

    // DTO -> Entity
    // Entity -> DTO
    private static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public void setPlaceRepository(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
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
        // Get Place(Entity) from database (using repository)
        Place place = placeRepository.findById(id).get(); // TODO: handle not found
        // map from Enity to DTO
        PlaceDTO result = modelMapper.map(place, PlaceDTO.class);
        return result;
    }
}
