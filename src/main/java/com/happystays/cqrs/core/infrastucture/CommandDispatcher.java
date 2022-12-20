package com.happystays.cqrs.core.infrastucture;

import com.happystays.cqrs.core.commands.BaseCommand;
import com.happystays.cqrs.core.commands.CommandHandlerMethod;
import com.happystays.cqrs.core.dto.response.BookResponse;

public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    BookResponse send(BaseCommand command);

}
