package no.nith.pg5100.dto;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Paul on 03.12.2015.
 */

@Entity
@NamedQuery(name = "Event.getAllEvents", query = "select e from Event e")
@SequenceGenerator(name = "SEQ_EVENT", initialValue = 50)
public class Event {
/*
    public Event(String title, String description, EventType eventtype, Subject subject {
        this.title = title;
        this.description = description;
        this.eventtype = eventtype;
        this.subject = subject;
        this.eventDetail = eventDetail;
    }
*/
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EVENT")
    public int id;

    @NotNull @Min(5) @Max(25)
    String title;

    @NotNull @Min(1) @Max(100)
    String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    EventType eventtype;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "FK_EVENT")
    private Subject subject;
/*
    @OneToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "EVENT_DET")
    private EventDetail eventDetail;

*/
    public Event() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public EventType getEventtype() {
        return eventtype;
    }

    public void setEventtype(EventType type) {
        this.eventtype = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
  /*
    public EventDetail getEventDetail() {
        return eventDetail;
    }

    public void setEventDetail(EventDetail eventDetail) {
        this.eventDetail = eventDetail;
    }

*/
}
