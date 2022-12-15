package com.happystays.cqrs.core.dto;

import lombok.Data;

@Data
public class PnrInfo {

    private String bookingCode;
    private String bookingDescription;
    private String bookingState;
    private String confirmationNumber;

}
