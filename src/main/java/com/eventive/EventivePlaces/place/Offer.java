package com.eventive.EventivePlaces.place;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private final UUID guid;
    private final Integer capacity;
    private final String style;

    @Embedded
    private final Hours hours;

    private final Boolean havePersonnel;
    private final Boolean haveCatering;
    private final Boolean haveDJ;
}
