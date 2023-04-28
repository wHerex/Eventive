package com.eventive.EventivePlaces.place;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Getter
@Embeddable
@NoArgsConstructor(force = true)
@AllArgsConstructor
class Hours {

    private final LocalDateTime startHour;
    private final LocalDateTime endHour;
}
