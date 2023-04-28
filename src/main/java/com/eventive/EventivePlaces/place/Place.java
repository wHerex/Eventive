package com.eventive.EventivePlaces.place;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Entity
class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private final UUID guid;
    private final String name;

    @OneToOne
    private final Address address;

    @OneToMany
    private final List<Offer> offers;

    @OneToMany
    private final List<Rating> rating;

    @OneToOne
    private final Contact contact;
}
