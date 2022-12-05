package com.happystays.cqrs.core.dto;

import lombok.Data;

@Data
public class Address {
    private String addressLine;
    private String cityName;
    private String postalCode;
    private String countryCode;
    private String countryName;
}
