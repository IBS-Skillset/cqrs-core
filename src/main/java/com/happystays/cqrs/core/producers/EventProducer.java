package com.happystays.cqrs.core.producers;

import com.happystays.cqrs.core.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
