package com.eventapp.service;

import java.util.*;

import com.eventapp.entities.Events;

public interface EventService {
	public Events getEventsById(int eventsId);

	public Events getEventsByEventName(String eventsName);

	public List<Events> getAllEvents();

	public Events addEvents(Events events);

	public Events updateEvents(int eventsId, Events events);

	public Events deleteEvents(int eventsId);

}
