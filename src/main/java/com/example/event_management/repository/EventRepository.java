package com.example.event_management.repository;

import com.example.event_management.eventservice.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
    // You can define custom query methods here if needed
}