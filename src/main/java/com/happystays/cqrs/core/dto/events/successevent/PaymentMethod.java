package com.happystays.cqrs.core.dto.events.successevent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethod {
    private String paymentType;
    private CreditCard creditCard;
}
