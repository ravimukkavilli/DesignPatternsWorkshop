package org.patterns.structural.decorator.completed;

public class EventServiceDecorator extends EventService {

    private EventService eventService;

    public EventServiceDecorator(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public int getCost() {
        return eventService.cost;
    }
}
