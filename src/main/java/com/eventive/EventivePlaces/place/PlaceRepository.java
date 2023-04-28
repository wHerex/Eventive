package com.eventive.EventivePlaces.place;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
interface PlaceRepository extends ListCrudRepository<Place, UUID> {

}
