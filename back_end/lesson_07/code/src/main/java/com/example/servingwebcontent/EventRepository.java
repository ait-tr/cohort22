package com.example.servingwebcontent;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// CrudRepository<(EntityClass), Integer>
// Integer - type of primary id used in Java code
public interface EventRepository extends CrudRepository<Event, Integer> {
}
