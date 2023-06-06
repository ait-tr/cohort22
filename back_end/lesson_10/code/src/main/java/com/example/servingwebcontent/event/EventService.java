package com.example.servingwebcontent.event;

import com.example.servingwebcontent.artist.Artist;
import com.example.servingwebcontent.artist.ArtistRepository;
import com.example.servingwebcontent.place.Place;
import com.example.servingwebcontent.place.PlaceController;
import com.example.servingwebcontent.place.PlaceRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private static final ModelMapper modelMapper = new ModelMapper();

    private EventRepository eventRepository;
    private PlaceRepository placeRepository;

    private ArtistRepository artistRepository;

    @Autowired
    public void setEventRepository(EventRepository eventRepository)
    {
        this.eventRepository = eventRepository;
    }

    @Autowired
    public void setPlaceRepository(PlaceRepository placeRepository)
    {
        this.placeRepository = placeRepository;
    }

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository)
    {
        this.artistRepository = artistRepository;
    }

    public List<EventDTO> getEvents(String cityFilter)
    {
        // 1. Get entity
        List<Event> allEvents = eventRepository.findAll(); // Get all events from database
        // 2. Move data to DTOs
        // map(1-st, 2-d)
        // 1-s source - allEvents - list of entity
        // 2-d type to convert - List<EventDTO>
        List<EventDTO> result = modelMapper.map(allEvents, new TypeToken<List<EventDTO>>(){}.getType());
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

    // NewEventDTO - name and id of place
    public int createEvent(NewEventDTO newEventDTO)
    {
        int placeId = newEventDTO.getPlaceId();
        // Get Entity Place
        Place place = placeRepository.findById(placeId).get();

        // Get entity Artist
        int artistId = newEventDTO.getArtistId();
        Artist artist = artistRepository.findById(artistId).get();


        // New Entity Event
        Event event = new Event();
        event.setName(newEventDTO.getName()); // Get name from dto and put it to Entity

        // Add place to Event
        event.setPlace(place); // MAIN LINE
        event.setArtist(artist);

        // Save to database
        return eventRepository.save(event).getId();
    }

    /**
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
    **/

    // Update entity with id with data eventDTO
    public void updateEvent(int id, NewEventDTO eventDTO)
    {
        // 1. Get from database
        // Get entity from database by ID
        Optional<Event> eventOptional = eventRepository.findById(id);
        Event event = eventOptional.get(); // TODO: check optinal

        // 2. Update with new data
        event.setName(eventDTO.getName());

        Place place = placeRepository.findById(eventDTO.getPlaceId()).get();
        Artist artist = artistRepository.findById(eventDTO.getArtistId()).get();

        event.setPlace(place);
        event.setArtist(artist);

        // 3. Save to database
        eventRepository.save(event);
    }

    // Return all events for place(with placeId)
    public List<EventDTO> getEventsByPlace(int placeId)
    {
        Place place = placeRepository.findById(placeId).get();
        List<Event> eventsForPlace = place.getEvents(); // getEvents() - SQL for that place event

        // Put data from entity to dto
        // modelMapper.map(source, Class/Type)

        // eventsForPlace -> List<EventDTO>
        List<EventDTO> result = modelMapper.map(eventsForPlace, new TypeToken<List<EventDTO>>(){}.getType());
        return result;
    }

    public List<EventDTO> getEventsForArtist(int artistId)
    {
        Artist artist = artistRepository.findById(artistId).get();

        List<Event> eventsForArtist = artist.getEvents();

        List<EventDTO> result = modelMapper.map(eventsForArtist, new TypeToken<List<EventDTO>>(){}.getType());
        return result;
    }
}
