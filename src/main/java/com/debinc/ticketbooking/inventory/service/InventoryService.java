package com.debinc.ticketbooking.inventory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.debinc.ticketbooking.inventory.entity.Event;
import com.debinc.ticketbooking.inventory.repository.EventRepository;
import com.debinc.ticketbooking.inventory.repository.VenueRepository;
import com.debinc.ticketbooking.inventory.response.EventInventoryResponse;

@Service
public class InventoryService {

    private final EventRepository eventRepository;
    private final VenueRepository venueRepository;

    public InventoryService(EventRepository eventRepository, VenueRepository venueRepository){
        this.eventRepository = eventRepository;
        this.venueRepository = venueRepository;
    }

    public List<EventInventoryResponse> getAllEvents() {
        final List<Event> events = eventRepository.findAll();
        return events.stream().map(event -> EventInventoryResponse.builder()
                .event(event.getName())
                .capacity(event.getLeftCapacity())
                .venue(event.getVenue())
                .build()).collect(Collectors.toList());
    }
    
}
