package com.happystays.cqrs.core.commands;

import com.happystays.cqrs.core.dto.BookResponse;

@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
    BookResponse handle(T command);
}
