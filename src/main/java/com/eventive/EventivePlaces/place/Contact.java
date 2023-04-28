package com.eventive.EventivePlaces.place;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Entity
class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private final UUID guid;
    private final String name;
    private final String email;
    private final Integer phoneNumber;
}
