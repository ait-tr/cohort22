package com.example.servingwebcontent.event;

import com.example.servingwebcontent.place.Place;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Now class mapped to database table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {
    @Id
    //@GeneratedValue // Create ID automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    // Owner - who hold id to another table
    @NotNull
    @ManyToOne
    private Place place; // column place_id == place.id
}
