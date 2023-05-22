package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("artists")
public class ArtistController {
    static final ArrayList<Artist> artists = new ArrayList<Artist>(){{
        add(new Artist("BandName", "Rock"));
        add(new Artist("BandName2", "Pop"));
    }};

    @GetMapping(value = "/{id}")
    public Artist getEvent(@PathVariable int id)
    {
        Artist event = artists.get(id);
        return event;
    }
}
