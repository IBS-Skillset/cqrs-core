package com.happystays.cqrs.core.dto;

import lombok.Data;

@Data
public class UserInfo {
    private String userId;
    private String prefix;
    private String givenName;
    private String surName;
    private String phoneNumber;
    private String email;
    private Address address;

}
