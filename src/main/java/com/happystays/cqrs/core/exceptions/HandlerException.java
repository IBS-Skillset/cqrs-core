package com.happystays.cqrs.core.exceptions;

public class HandlerException extends RuntimeException {
    public HandlerException(String message) {
        super(message);
    }
}