package com.debinc.ticketbooking.inventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event")
public class Event {

    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "total_capacity")
    private Long totalCapacity;

    @Column(name = "left_capacity")
    private Long leftCapacity;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;
    
}
