package com.happystays.cqrs.core.commands;

import com.happystays.cqrs.core.dto.response.BookResponse;

@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
    BookResponse handle(T command);
}
