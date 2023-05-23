package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // = @Controller + @ResponseBody
@RequestMapping("artists") // http://localhost:8080/artists/()
public class ArtistController {
    private ArtistService artistService;

    @Autowired // IoC
    public void setArtistService(ArtistService artistService) { // DI
        this.artistService = artistService;
    }

    //@RequestMapping(value = "artists/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/{id}")
    public Artist getArtist(@PathVariable int id)
    {
        return artistService.getAtrist(id);
    }

    // GET
    // URL: /artists
    @GetMapping(value = "")
    public List<Artist> listArtists()
    {
        return artistService.artistList();
    }

    // HTTP Method: DELETE
    // URL: /artists/{id}
    // Request url: http://localhost:8080/artists/5
    @DeleteMapping(value = "/{id}")
    public void deleteArtist(@PathVariable int id)
    {
        // TODO: Remove from database
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
    public void createArtist(@RequestBody Artist artist)
    {
        // TODO: Save Artist to database
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
    public void updateArtist(@PathVariable int id, @RequestBody Artist newArtist)
    {
        // TODO: update atrist in database
    }
}
