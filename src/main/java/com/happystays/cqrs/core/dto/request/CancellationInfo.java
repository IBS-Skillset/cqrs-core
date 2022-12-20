package com.happystays.cqrs.core.dto.request;

import lombok.Data;

@Data
public class CancellationInfo {
    private boolean isCancellable;
    private String cancellationDate;
    private String cancellationPolicy;
}
