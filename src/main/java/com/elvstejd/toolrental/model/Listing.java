package com.elvstejd.toolrental.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "listings")
@Getter
@Setter
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int rate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
}
