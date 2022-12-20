package com.happystays.cqrs.core.handlers;

import com.happystays.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {
    public void saveEvents(AggregateRoot aggregateRoot);
}
