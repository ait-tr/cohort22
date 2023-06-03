package com.example.servingwebcontent.event;

import com.example.servingwebcontent.place.PlaceDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
// for response
public
class EventDTO {
    @Schema(description = "Name of the event")
    private String name;

    private PlaceDTO place;
}
