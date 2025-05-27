package com.debinc.ticketbooking.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debinc.ticketbooking.inventory.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
    
    
}
