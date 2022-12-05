package com.happystays.cqrs.core.infrastucture;

import com.happystays.cqrs.core.domain.BaseEntity;
import com.happystays.cqrs.core.queries.BaseQuery;
import com.happystays.cqrs.core.queries.QueryHandlerMethod;

import java.util.List;

public interface QueryDispatcher {
    <T extends BaseQuery> void registerHandler(Class<T> type, QueryHandlerMethod<T> handler);
    <U extends BaseEntity> List<U> send(BaseQuery query);
}
