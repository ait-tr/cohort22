package com.example.servingwebcontent.place;

import com.example.servingwebcontent.artist.ArtistDTO;
import com.example.servingwebcontent.artist.ArtistService;
import com.example.servingwebcontent.event.EventDTO;
import com.example.servingwebcontent.event.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("places") // URL: POST /places and /places/{id}
public class PlaceController {
    private PlaceService placeService;
    private EventService eventsService;

    private ArtistService artistService;

    @Autowired
    public void setPlaceService(PlaceService placeService) {
        this.placeService = placeService;
    }

    @Autowired
    public void setEventsService(EventService eventsService) {
        this.eventsService = eventsService;
    }

    @Autowired
    public void setArtistService(ArtistService artistService)
    {
        this.artistService = artistService;
    }

    @PostMapping // POST /places
    public int createPlace(@RequestBody NewPlaceDTO newPlaceDTO)
    {
        return placeService.createPlace(newPlaceDTO);
    }

    @GetMapping(value = "/{id}") // GET /places/12
    public PlaceDTO getPlace(@PathVariable int id)
    {
        return placeService.getPlace(id);
    }

    // Endpoint API
    // GET /places/{placeId}/events - get all events for the place(with placeId)
    @GetMapping(value = "/{placeId}/events")
    public List<EventDTO> getEventsByPlace(@PathVariable int placeId)
    {
        return eventsService.getEventsByPlace(placeId);
    }

    // Endpoint: places/{placeId}/artists
    @GetMapping(value = "/{placeId}/artists")
    public List<ArtistDTO> getArtistByPlaceId(@PathVariable int placeId)
    {
        return artistService.getArtistByPlaceId(placeId);
    }

    @GetMapping(value = "/by-city/{city}")
    public List<PlaceDTO> getPlacesByCity(@PathVariable String city)
    {
        return placeService.getPlacesByCityName(city);
    }


    @GetMapping(value = "/by-city/{city}/address/{address}")
    public List<PlaceDTO> getPlacesByCityWithAddress(@PathVariable String city, @PathVariable String address)
    {
        return placeService.getPlacesByCityWithAddress(city, address);
    }
}
