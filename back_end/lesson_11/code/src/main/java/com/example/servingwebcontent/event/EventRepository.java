package com.example.servingwebcontent.event;

import com.example.servingwebcontent.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// CrudRepository<(EntityClass), Integer>
// Integer - type of primary id used in Java code
// CrudRepository -> JpaRepository
public interface EventRepository extends JpaRepository<Event, Integer> {

    // table: event
    // Entity: Event

    //SELECT event.id, event.name, event.place_id, event.artist_ref_id  FROM event
    //	  INNER JOIN place ON event.place_id = place.id
    //    WHERE place.city = 'London'

    // SELECT e.id,e.artist_ref_id,e.name,e.place_id from event e
    //   JOIN place p on p.id=e.place_id
    //   WHERE p.city="London"

    /// SELECT e FROM Event e <- id, artist_ref_id, name, place_id
    //  INNER JOIN e.place p  <-join place table
    //  WHERE p.city = :city


    // SELECT e.id,e.artist_ref_id,e.name,e.place_id from event e
    //   JOIN place p on p.id=e.place_id
    //   WHERE p.city="London"
    @Query("SELECT e FROM Event e INNER JOIN e.place p WHERE p.city = :city")
    List<Event> findFilteredByCity(@Param("city") String city);
}
