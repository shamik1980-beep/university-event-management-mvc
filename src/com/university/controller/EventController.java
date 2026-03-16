package com.university.controller;

import com.university.model.Event;
import com.university.view.EventView;

import java.util.ArrayList;
import java.util.List;

public class EventController {
    private List<Event> eventList;
    private EventView view;

    public EventController(EventView view) {
        this.view = view;
        this.eventList = new ArrayList<>();
    }

    // Branch Add Event Created and updating Event Controller with addEvent 
    public void addEvent(Event event) {
        eventList.add(event);
        view.showMessage("Event added successfully.");
    }

    public Event searchEventById(int eventId) {
        for (Event event : eventList) {
            if (event.getEventId() == eventId) {
                return event;
            }
        }
        return null;
    }

    public void updateEventLocation(int eventId, String newVenue) {
        Event event = searchEventById(eventId);
        if (event != null) {
            event.setEventVenue(newVenue);
            view.showMessage("Event venue updated successfully.");
        } else {
            view.showMessage("Event not found.");
        }
    }

    public void displayEvent(int eventId) {
        Event event = searchEventById(eventId);
        if (event != null) {
            view.displayEventDetails(event);
        } else {
            view.showMessage("Event not found.");
        }
    }

    public void displayAllEvents() {
        if (eventList.isEmpty()) {
            view.showMessage("No events available.");
            return;
        }

        for (Event event : eventList) {
            view.displayEventDetails(event);
        }
    }
}
