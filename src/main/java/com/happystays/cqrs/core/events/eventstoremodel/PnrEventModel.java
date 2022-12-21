package com.happystays.cqrs.core.events.eventstoremodel;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class PnrEventModel {
    private String bookingState;
    private String confirmationNumber;
    private double totalAmount;
    private String beginDate;
    private String endDate;
    private int occupancy;
    private Date creationDate;
}
