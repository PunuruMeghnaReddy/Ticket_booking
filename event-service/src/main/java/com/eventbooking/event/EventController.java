package com.eventbooking.event;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/events/test")
    public String testEventService() {
        return "Event Service is working!";
    }
}