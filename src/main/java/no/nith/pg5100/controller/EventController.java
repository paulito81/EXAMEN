package no.nith.pg5100.controller;


import no.nith.pg5100.dto.Event;
import no.nith.pg5100.dto.EventDetail;
import no.nith.pg5100.dto.EventType;
import no.nith.pg5100.infrastructure.event.EventDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Paul on 03.12.2015.
 */
@Model
public class EventController {

    @Inject
    private EventDAO eventDAO;

    private int eventId;
    private Event event;

    public EventDetail getEventDetail() {
        return eventDetail;
    }

    public void setEventDetail(EventDetail eventDetail) {
        this.eventDetail = eventDetail;
    }

    private EventDetail eventDetail;


    @PostConstruct
    public void init() {
        event = new Event();
    }



    public void persistNewEvent(){
        eventDAO.persistEvent(event);
    }

    public List<Event> getAllEvents(){
        return eventDAO.getAllEvents();
    }

    public void getDetailedEvent(){
        event = eventDAO.detailedEvent(eventId);
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<SelectItem> getEventTypes(){
        return Arrays.asList(EventType.values()).stream().map(e-> new SelectItem(e, e.name())).collect(Collectors.toList());

    }

}
