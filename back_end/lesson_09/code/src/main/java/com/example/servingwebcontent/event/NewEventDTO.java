package com.example.servingwebcontent.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
// For create and update
public class NewEventDTO {
    private String name;
    private int placeId;
}
