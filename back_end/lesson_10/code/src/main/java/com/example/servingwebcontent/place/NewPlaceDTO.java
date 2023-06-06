package com.example.servingwebcontent.place;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewPlaceDTO { // for create place
    private String name;
    private String address;
    private String city;
}
