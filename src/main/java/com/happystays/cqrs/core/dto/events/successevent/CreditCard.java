package com.happystays.cqrs.core.dto.events.successevent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    private String maskedCardNumber;
    private String cardHolderName;
}
