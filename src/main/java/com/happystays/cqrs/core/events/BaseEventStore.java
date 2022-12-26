package com.happystays.cqrs.core.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Document(collection = "eventStore")
public abstract class BaseEventStore {
    @Id
    private String id;
    private String aggregateId;
    private String aggregateType;
    private String eventType;
    private int version;
    private Date creationDate;
}
