package com.example.servingwebcontent;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("events")
@Tag(name = "Events", description = "Working with events")
public class EventsController {


    private EventService service;

    @Autowired // Io
    public void setService(EventService service) {
        this.service = service;
    }


    @Operation(summary = "Get all events", description = "Get all events filter by city")
    @GetMapping(value = "")
    public List<EventDTO> listEvents(@RequestParam(name = "city", required = false, defaultValue = "all") String city) {
        return service.getEvents(city);
    }

    @GetMapping(value = "/{id}")
    public EventDTO getEvent(@PathVariable int id)
    {
        return service.getEvent(id);
    }

    @PostMapping(value = "")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "Created")
    public EventDTO createEvent(@RequestBody EventDTO eventDTO)
    {
        return service.createEvent(eventDTO);
    }

    @DeleteMapping(value = "/{id}")
    public EventDTO deleteEvent(@PathVariable int id)
    {
        return service.deleteEvent(id);
    }

    @PutMapping(value = "/{id}")
    public EventDTO updateEvent(@PathVariable int id, @RequestBody EventDTO eventDTO)
    {
        return service.updateEvent(id, eventDTO);
    }

}
