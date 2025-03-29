package com.harshith.contestpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshith.contestpro.Dao.EventResultInsert;

@Service
public class EventService {

    @Autowired
    private EventResultInsert eventRepository;

    public void registerEvent(int personId, int clubId, String position, int eventId, String gender) {
        eventRepository.saveEventRegistration(personId, clubId, position, eventId, gender);
    }
}