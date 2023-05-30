package com.example.servingwebcontent.event;

import com.example.servingwebcontent.event.EventService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("events")
@Tag(name = "Events", description = "Working with events")
public class EventsController {
    private EventService service;

    @Autowired // IoC
    public void setService(EventService service) {
        this.service = service;
    }


    // example.com/some/some?var1=value1&some=value
    // @RequestParam(name = "var1", required = false, defaultValue = "all") String var1
    // example.com/some/some?var1=value1&var2=value2

    @Operation(summary = "Get all events", description = "Get all events filter by city")
    @GetMapping
    // URL: /events?city=Berlin
    public List<EventDTO> listEvents(@RequestParam(name = "city", required = false, defaultValue = "all") String city) {
        return service.getEvents(city);
    }

    // URL: events/{id}
    // events/12
    // events/1
    // enents/
    @GetMapping(value = "/{id}")
    public EventDTO getEvent(@PathVariable int id)
    {
        return service.getEvent(id);
    }

    // POST /events
    @PostMapping(value = "")
    public void createEvent(@RequestBody EventDTO eventDTO)
    {
        // eventDTO from API - EventDTO
        service.createEvent(eventDTO);
    }

    // HTTP Method: DELETE
    // URL: events/{id}
    // events/1 -> id = 1
    // events/12 -> id = 12
    // events/5 -> id = 5
    @DeleteMapping(value = "/{id}")
    public void deleteEvent(@PathVariable int id)
    {
        service.deleteEvent(id);
    }

    // HTTP Method: PUT
    // URL: events/{id} -> id (@PathVariable)
    // events/1
    // Body: -> EventDTO eventDTO (@RequestBody)
    /*
     {
        "name" : "newname",
        "city" : "newcity"
     }
    */
    @PutMapping(value = "/{id}")
    public void updateEvent(@PathVariable int id, @RequestBody EventDTO eventDTO)
    {
        service.updateEvent(id, eventDTO);
    }

}
