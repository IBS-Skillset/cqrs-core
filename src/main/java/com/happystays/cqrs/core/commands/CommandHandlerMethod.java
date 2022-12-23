package com.happystays.cqrs.core.commands;


import com.happystays.cqrs.core.response.BaseResponse;

@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
    BaseResponse handle(T command);
}
