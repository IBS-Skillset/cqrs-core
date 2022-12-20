package com.happystays.cqrs.core.infrastucture;

import com.happystays.cqrs.core.events.BookingSuccessEvent;

public interface EventStore {
    public void saveEvents(String aggregateId, Iterable<BookingSuccessEvent> events, int expectedVersion);
}
