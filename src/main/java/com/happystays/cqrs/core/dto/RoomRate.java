package com.happystays.cqrs.core.dto;

import lombok.Data;

@Data
public class RoomRate {

    private String currencyCode;
    private double totalAmount;
    private String rateDescription;

}
