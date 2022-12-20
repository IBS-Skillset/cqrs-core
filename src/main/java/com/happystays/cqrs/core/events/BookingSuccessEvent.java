package com.happystays.cqrs.core.events;

import com.happystays.cqrs.core.dto.events.successevent.Pnr;
import com.happystays.cqrs.core.dto.events.successevent.Trip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BookingSuccessEvent extends BaseEvent {
    private Trip trip;
}
