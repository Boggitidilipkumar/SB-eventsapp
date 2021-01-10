package com.eventapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventapp.entities.Events;
import com.eventapp.service.EventService;

@RestController
@RequestMapping("api")
public class EventsRestController {
	private EventService eventService;
	@Autowired
	public EventsRestController(EventService eventService) {
		this.eventService = eventService;
	}
	
	//to get all events
	@GetMapping(path="events",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Events>> getAllEvents(){
		List<Events> Events=eventService.getAllEvents();
		return new ResponseEntity<List<Events>>(Events,HttpStatus.OK);
	}
	
	//to get  events with id
		@GetMapping(path="events/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Events> getEventsById(@PathVariable(name="id")int eventsId){
			Events Events=eventService.getEventsById(eventsId);
			return new ResponseEntity<Events>(Events,HttpStatus.OK);
		}
		
		//add new events
		@PostMapping(path="events",produces=MediaType.APPLICATION_JSON_VALUE
				,consumes=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Events> addEvents(@Valid @RequestBody Events events){
			Events addedEvents=eventService.addEvents(events);
			return new ResponseEntity<Events>(addedEvents,HttpStatus.CREATED);
		}
		
		
		//update events
		
		@PutMapping(path="events/{id}",produces=MediaType.APPLICATION_JSON_VALUE
				,consumes=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Events> updateEvents(@PathVariable(name="id")int eventsId,@RequestBody Events events){
			Events updatedEvents=eventService.updateEvents(eventsId, events);
			return new ResponseEntity<Events>(updatedEvents,HttpStatus.OK);
		}
		
		
		//delete events
		
		@DeleteMapping(path="events/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Void> deleteEvents(@PathVariable(name="id")int eventsId) {
			Events eventDeleted=eventService.deleteEvents(eventsId);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	
	
	
	

}
