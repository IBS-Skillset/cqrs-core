package com.happystays.cqrs.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse extends BaseResponse {
    private String id;
    private ResponseStatus responseStatus;
    private PnrInfo pnrInfo;
    private String startDate;
    private String endDate;
    private String hotelCode;
    private String hotelName;
    private HotelAddress hotelAddress;
    private String ratePlanId;
    private RoomRate roomRate;

    public BookResponse(String message, String id) {
        super((message));
        this.id = id;
    }
}
