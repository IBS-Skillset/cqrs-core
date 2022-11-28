package com.happystay.cqrs.core.infrastucture;

import com.happystay.cqrs.core.commands.BaseCommand;
import com.happystay.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    void send(BaseCommand command);

}
