package com.eventapp.exceptions;

public class EventNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 97389826587615354L;

	public EventNotFoundException(String message) {
		super(message);
	}

}
