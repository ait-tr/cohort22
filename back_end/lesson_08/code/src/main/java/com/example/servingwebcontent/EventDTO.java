package com.example.servingwebcontent;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
class EventDTO {
    @Schema(description = "Name of the event")
    private String name;

    @Schema(description = "Location of the event")
    private String city;
}
