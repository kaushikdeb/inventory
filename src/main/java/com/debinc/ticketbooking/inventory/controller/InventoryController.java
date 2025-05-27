package com.debinc.ticketbooking.inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.debinc.ticketbooking.inventory.response.EventInventoryResponse;
import com.debinc.ticketbooking.inventory.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }
    
    @GetMapping("inventory/events")
    public List<EventInventoryResponse> getAllEvents(){
        return inventoryService.getAllEvents();
    }

}
