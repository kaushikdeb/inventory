package com.debinc.ticketbooking.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debinc.ticketbooking.inventory.entity.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long>{
    
}
