package com.harshith.contestpro.Dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_registration")
public class EventResult {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int personId;
    private int clubId;
    private String position;
    private int eventId;
    private String gender;

    // Constructors
    public EventResult() {}

    public EventResult(int personId, int clubId, String position, int eventId, String gender) {
        this.personId = personId;
        this.clubId = clubId;
        this.position = position;
        this.eventId = eventId;
        this.gender = gender;
    }

    // Getters & Setters
    public int getPersonId() { return personId; }
    public void setPersonId(int personId) { this.personId = personId; }

    public int getClubId() { return clubId; }
    public void setClubId(int clubId) { this.clubId = clubId; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public int getEventId() { return eventId; }
    public void setEventId(int eventId) { this.eventId = eventId; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id;  }
}