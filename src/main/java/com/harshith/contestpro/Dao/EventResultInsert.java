package com.harshith.contestpro.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;

@Entity
public interface EventResultInsert extends JpaRepository<EventResultInsert, Long> {
    
    @Transactional
    @Procedure(name = "save_event_registration")
    void saveEventRegistration(
        @Param("p_person_id") int personId,
        @Param("p_club_id") int clubId,
        @Param("p_position") String position,
        @Param("p_event_id") int eventId,
        @Param("p_gender") String gender
    );
}