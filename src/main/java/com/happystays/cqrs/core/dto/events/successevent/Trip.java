package com.happystays.cqrs.core.dto.events.successevent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    private double totalPrice;
    private String currencyCode;
    private String beginDate;
    private String endDate;
    private List<Pnr> pnrList;
}
