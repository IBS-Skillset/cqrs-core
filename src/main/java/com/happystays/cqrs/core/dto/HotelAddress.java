package com.happystays.cqrs.core.dto;

import lombok.Data;

@Data
public class HotelAddress {

    private String streetAddress;
    private String cityName;
    private String zipCode;
    private String countryName;

}
