package com.example.servingwebcontent.place;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlaceDTO {
    private int id;
    private String name;
    private String address;
    private String city;
}
