package com.eventive.EventivePlaces.place;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
record PlaceDto(UUID guid, String name, Address address, List<Offer> offers, List<Rating> rating, Contact contact) {

}
