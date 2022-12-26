package com.happystays.cqrs.core.infrastucture;

import com.happystays.cqrs.core.events.BaseEvent;

public interface EventStore {
    void saveEvents(String aggregateId, Iterable<BaseEvent> events, int expectedVersion);
}
