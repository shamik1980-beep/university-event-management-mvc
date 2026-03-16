package com.university;

import com.university.controller.EventController;
import com.university.model.Event;
import com.university.view.EventView;

public class Main {
    public static void main(String[] args) {
        EventView view = new EventView();
        EventController controller = new EventController(view);

        controller.addEvent(new Event(1, "AI Workshop", "15-04-2026", "Seminar Hall", "College of Computing"));
        controller.addEvent(new Event(2, "Research Conference", "20-04-2026", "Auditorium", "Research Committee"));
        controller.addEvent(new Event(3, "Hackathon", "25-04-2026", "Lab 3", "Innovation Club"));

        controller.displayAllEvents();
        controller.displayEvent(2);
        controller.updateEventLocation(2, "Main Conference Room");
        controller.displayEvent(2);
    }
}
