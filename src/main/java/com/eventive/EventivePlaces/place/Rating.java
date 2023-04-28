package com.eventive.EventivePlaces.place;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Entity
class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private final UUID guid;

    @OneToOne
    private final Contact client;
    private final Rate rate;
    private final String description;
}
