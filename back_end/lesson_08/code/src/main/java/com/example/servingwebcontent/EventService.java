package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventService {


    private EventRepository eventRepository;

    @Autowired
    public void setEventRepository(EventRepository eventRepository)
    {
        this.eventRepository = eventRepository;
    }

    static final ArrayList<EventDTO> EVENT_DTOS = new ArrayList<EventDTO>(){{
        add(new EventDTO("Opera", "London"));
        add(new EventDTO("Violin concert", "Prague"));
        add(new EventDTO("Jazz concert", "Berlin"));
        add(new EventDTO("Art exhibition", "London"));
    }};

    public List<EventDTO> getEvents(String cityFilter)
    {
        // eventRepository.findAll()
        //eventRepository.deleteAll();

        Iterable<Event> allEvents = eventRepository.findAll(); // Get all events from database

        ///
        List<EventDTO> result = new ArrayList<EventDTO>();
        for (Event event : allEvents)
        {
            // Mapping Entity to DTO
            // Hide ID
            EventDTO eventDTO = new EventDTO(event.getName(), event.getCity());
            result.add(eventDTO);
        }
        return result;
    }

    public EventDTO getEvent(int id)
    {
        // Optional 2 state:
        // 1. I'm empty. I have no value
        // 2. Has value;

        // Get data from database
        Optional<Event> eventOptional = eventRepository.findById(id);

        Event event = eventOptional.get(); // TODO: handle error. Exception if data not found
        // Copy data to DTO
        EventDTO eventDTO = new EventDTO(event.getName(), event.getCity());
        return eventDTO;
    }

    public void deleteEvent(int id)
    {
        // Remove from database
        eventRepository.deleteById(id); // deleteById - from CrudRepository
    }

    public void createEvent(EventDTO eventDTO)
    {
        // EventDTO eventDTO from controller

        // Pass data from eventDTO(for API and controller) to Event(Entity) for database
        String name = eventDTO.getName();
        String city = eventDTO.getCity();

        // Create entity
        Event event = new Event(); // Entity for save for database
        event.setName(name);
        event.setCity(city);

        // Save entity to database
        eventRepository.save(event); // CrudRepository
    }

    // Update entity with id with data eventDTO
    public void updateEvent(int id, EventDTO eventDTO)
    {
        // Get entity from database by ID
        Optional<Event> eventOptional = eventRepository.findById(id);
        Event event = eventOptional.get(); // TODO: check optinal

        // Update data
        event.setName(eventDTO.getName());
        event.setCity(eventDTO.getCity());

        // Save to database
        eventRepository.save(event);
    }

}
