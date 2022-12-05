package com.happystays.cqrs.core.dto;

import lombok.Data;

@Data
public class PnrInfo {

    private String bookingCode;
    private String bookingDesc;
    private String bookingState;
    private String confirmationNumber;

}
