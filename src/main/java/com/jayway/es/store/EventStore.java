package com.jayway.es.store;

import java.util.List;
import java.util.UUID;

import rx.Observable;

import com.jayway.es.api.Event;

public interface EventStore<V> {
	EventStream<Long> loadEventStream(UUID aggregateId);
	void store(UUID aggregateId, long version, List<Event> events);
	Observable<Event> all();
}
