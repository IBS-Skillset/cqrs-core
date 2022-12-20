package com.happystays.cqrs.core.events;

import com.happystays.cqrs.core.dto.events.eventmodel.PnrEventModel;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "eventStore")
public class EventModel {
    @Id
    private String id;
    private String aggregateId;
    private String aggregateType;
    private int version;
    private PnrEventModel eventData;
}
