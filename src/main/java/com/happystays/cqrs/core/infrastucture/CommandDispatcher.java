package com.happystays.cqrs.core.infrastucture;

import com.happystays.cqrs.core.commands.BaseCommand;
import com.happystays.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    void send(BaseCommand command);

}
