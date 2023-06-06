package com.example.servingwebcontent.event;

import com.example.servingwebcontent.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// CrudRepository<(EntityClass), Integer>
// Integer - type of primary id used in Java code
// CrudRepository -> JpaRepository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
