package com.example.servingwebcontent.artist;

import com.example.servingwebcontent.genre.GenreDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ArtistDTO {
    private String name;
    private GenreDTO genre;
}
