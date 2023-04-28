package com.eventive.EventivePlaces.place;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class PlaceService {

    private final PlaceRepository placeRepository;
    Place savePlace(Place place){
        return placeRepository.save(place);
    }
}
