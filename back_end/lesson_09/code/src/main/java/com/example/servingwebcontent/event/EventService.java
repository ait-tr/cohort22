package com.example.servingwebcontent.event;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private static final ModelMapper modelMapper = new ModelMapper();

    private EventRepository eventRepository;

    @Autowired
    public void setEventRepository(EventRepository eventRepository)
    {
        this.eventRepository = eventRepository;
    }

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
        //EventDTO eventDTO = new EventDTO(event.getName(), event.getCity());
        //return eventDTO;

        EventDTO eventDTO = modelMapper.map(event, EventDTO.class);
        return eventDTO;

        // Event -> EventDTO
        // 1-st. источник
        // 2-d. куда - назначение
        //return modelMapper.map(event, EventDTO.class);
    }

    public void deleteEvent(int id)
    {
        // Remove from database
        eventRepository.deleteById(id); // deleteById - from CrudRepository
    }

    public void createEvent(EventDTO eventDTO)
    {
        // Put data from eventDTO in Event(Entity) for DB
        // 1-st argument: eventDTO - source(источник)
        // 2-d argument:  destination class. В какой класс переложить данные.

        // modelMapper.map do
        // 1. creates Event
        // 2. put all fields from eventDTO by names (name -> name, city -> city)
        // 3. return Event

        Event event = modelMapper.map(eventDTO, Event.class);
        // Save entity to database
        eventRepository.save(event); // CrudRepository
        //return eventDTO;
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
