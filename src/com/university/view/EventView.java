package com.university.view;

import com.university.model.Event;

public class EventView {

    public void displayEventDetails(Event event) {
        System.out.println("----- Event Details -----");
        System.out.println("Event ID   : " + event.getEventId());
        System.out.println("Event Name : " + event.getEventName());
        System.out.println("Date       : " + event.getEventDate());
        System.out.println("Venue      : " + event.getEventVenue());
        System.out.println("Organizer  : " + event.getOrganizer());
        System.out.println("-------------------------");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
