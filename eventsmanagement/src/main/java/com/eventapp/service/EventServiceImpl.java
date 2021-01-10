package com.eventapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventapp.entities.Events;
import com.eventapp.exceptions.ResourceNotFoundException;
import com.eventapp.repo.EventsReop;

@Service
@Transactional
public class EventServiceImpl implements EventService {

	private EventsReop eventsRepo;

	@Autowired
	public EventServiceImpl(EventsReop eventsRepo) {
		this.eventsRepo = eventsRepo;
	}

	@Override
	public Events getEventsById(int eventsId) {
		return eventsRepo.findById(eventsId)
				.orElseThrow(() -> new ResourceNotFoundException("events with id:" + eventsId + "is not found"));
	}

	@Override
	public Events getEventsByEventName(String eventsName) {
		return null;
	}

	@Override
	public List<Events> getAllEvents() {
		return eventsRepo.findAll();
	}

	@Override
	public Events addEvents(Events events) {
		eventsRepo.save(events);
		return events;
	}

	@Override
	public Events updateEvents(int eventsId, Events events) {
		Events eventToUpdate = getEventsById(eventsId);
		eventToUpdate.setPrice(events.getPrice());
		eventToUpdate.setDiscount(events.getDiscount());
		eventsRepo.save(eventToUpdate);
		return eventToUpdate;
	}

	@Override
	public Events deleteEvents(int eventsId) {
		Events eventToDelete = getEventsById(eventsId);
		eventsRepo.delete(eventToDelete);
		return eventToDelete;
	}

}
