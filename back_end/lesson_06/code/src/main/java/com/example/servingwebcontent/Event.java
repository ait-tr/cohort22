package com.example.servingwebcontent;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
class Event {
    @Schema(description = "Name of the event")
    private String name;
    @Schema(description = "Location of the event")
    private String city;
}
