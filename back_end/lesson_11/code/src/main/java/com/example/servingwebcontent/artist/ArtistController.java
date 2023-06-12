package com.example.servingwebcontent.artist;

import com.example.servingwebcontent.event.EventDTO;
import com.example.servingwebcontent.event.EventService;
import com.example.servingwebcontent.event.NewEventDTO;
import com.example.servingwebcontent.place.PlaceDTO;
import com.example.servingwebcontent.place.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // = @Controller + @ResponseBody
@RequestMapping("artists") // http://localhost:8080/artists/()
public class ArtistController {
    private ArtistService artistService;
    private EventService eventService;

    private PlaceService placeService;

    @Autowired // IoC
    public void setArtistService(ArtistService artistService) { // DI
        this.artistService = artistService;
    }

    @Autowired
    public void setEventService(EventService eventService)
    {
        this.eventService = eventService;
    }

    @Autowired
    public void setPlaceService(PlaceService placeService) {
        this.placeService = placeService;
    }

    //@RequestMapping(value = "artists/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/{id}")
    public ArtistDTO getArtist(@PathVariable int id)
    {
        return artistService.getArtist(id);
    }

    // GET
    // URL: /artists
    @GetMapping(value = "")
    public List<ArtistDTO> listArtists()
    {
        return artistService.artistList();
    }

    // HTTP Method: DELETE
    // URL: /artists/{id}
    // Request url: http://localhost:8080/artists/5
    @DeleteMapping(value = "/{id}")
    public void deleteArtist(@PathVariable int id)
    {
        artistService.deleteArtist(id);
    }

    // URL: /artists
    // HTTP Method: POST

    /**
     * {
     *   "name": "SomeBandName",
     *   "genre": "Post-Rock"
     * }
     */
    @PostMapping(value = "")
    public int createArtist(@RequestBody NewArtistDTO artistDTO)
    {
        int id = artistService.createArtist(artistDTO);
        return id;
    }

    // URL: /artists/1
    // Method: PUT
    // Body
    /**
     * {
     *   "name": "SomeBandName",
     *   "genre": "Post-Rock"
     * }
     */
    @PutMapping(value = "/{id}")
    public void updateArtist(@PathVariable int id, @RequestBody ArtistDTO newArtistDTO)
    {
        artistService.updateArtist(id, newArtistDTO);
    }

    // Endpoint: GET artists/{artistId}/events
    @GetMapping(value = "/{artistId}/events")
    public List<EventDTO> getEventsForArtist(@PathVariable int artistId)
    {
        return eventService.getEventsForArtist(artistId);
    }

    // Enpoint: GET /artists/{artistId}/places
    @GetMapping(value = "/{artistId}/places")
    public List<PlaceDTO> getPlacesByArtistId(@PathVariable int artistId)
    {
        return placeService.getPlacesByArtistId(artistId);
    }
}
