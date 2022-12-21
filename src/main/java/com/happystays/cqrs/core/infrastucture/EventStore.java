package com.happystays.cqrs.core.infrastucture;

import com.happystays.cqrs.core.events.BaseEvent;

public interface EventStore {
    public void saveEvents(String aggregateId, BaseEvent events, int expectedVersion);
}
