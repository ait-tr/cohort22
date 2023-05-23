package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
        EventDTO eventDTO = EVENT_DTOS.get(id);
        return eventDTO;
    }

    public EventDTO deleteEvent(int id)
    {
        EventDTO eventDTO = EVENT_DTOS.get(id);
        // TODO: remove it from the database
        return eventDTO;
    }

    public EventDTO createEvent(EventDTO eventDTO)
    {
        // Pass data from eventDTO(for API and controller) to Event(Entity) for database
        String name = eventDTO.getName();
        String city = eventDTO.getCity();
        Event event = new Event();
        event.setName(name);
        event.setCity(city);

        // Save to database
        eventRepository.save(event);

        return eventDTO;
    }

    public EventDTO updateEvent(int id, EventDTO eventDTO)
    {
        EventDTO origEventDTO = EVENT_DTOS.get(id);
        // TODO: update event in the database
        //origEvent = event; // useless just for example
        return eventDTO;
    }

}
