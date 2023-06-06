package com.example.servingwebcontent.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("genres") // URL: /genres
public class GenreController {

    private GenreService genreService;

    @Autowired
    public void setGenreService(GenreService genreService) {
        this.genreService = genreService;
    }

    @PostMapping
    public int createGenre(@RequestBody NewGenreDTO newGenreDTO)
    {
        return genreService.createGenre(newGenreDTO);
    }

    @GetMapping(value = "/{id}") // path variable
    public GenreDTO getGenre(@PathVariable int id)
    {
        return genreService.getGenre(id);
    }

}
