package com.debinc.ticketbooking.inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.debinc.ticketbooking.inventory.response.EventInventoryResponse;
import com.debinc.ticketbooking.inventory.response.VenueInventoryResponse;
import com.debinc.ticketbooking.inventory.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;



@RestController
@RequestMapping("/api/v1")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }
    
    @GetMapping("/inventory/events")
    public @ResponseBody List<EventInventoryResponse> getAllEvents(){
        return inventoryService.getAllEvents();
    }

    @GetMapping("/inventory/venue/{venueId}")
    public @ResponseBody VenueInventoryResponse inventoryVenuById(@PathVariable("venueId") Long venueId) {
        return inventoryService.getVenueInformation(venueId);
    }
    
}
