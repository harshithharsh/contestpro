package com.harshith.contestpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harshith.contestpro.service.EventService;

@RestController
@RequestMapping("/api/events")
public class ContestProController {

    @Autowired
    private EventService eventService;

    @PostMapping("/register")
    public String registerEvent(
            @RequestParam int personId,
            @RequestParam int clubId,
            @RequestParam String position,
            @RequestParam int eventId,
            @RequestParam String gender) {
        
        eventService.registerEvent(personId, clubId, position, eventId, gender);
        return "Event registration successful!";
    }
}