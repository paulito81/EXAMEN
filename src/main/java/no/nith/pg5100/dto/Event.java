package no.nith.pg5100.dto;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Paul on 03.12.2015.
 */

@Entity
@NamedQuery(name = "Event.getAllEvents", query = "select e from Event e")
@SequenceGenerator(name = "SEQ_EVENT", initialValue = 50)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EVENT")
    private int id;

    @NotNull @Size(min = 5, max =25)
    private String title;

    @NotNull @Size(min = 5, max =100)
    private String description;

   // private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EventType eventtype;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "EVENT_DET")
    private EventDetail eventDetail;

    public Event() {

    }
    public Event(String title, String description, EventType eventtype) {
        this.title = title;
        this.description = description;
        this.eventtype = eventtype;
    }
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public EventDetail getEventDetail() {
        return eventDetail;
    }

    public void setEventDetail(EventDetail eventDetail) {
        this.eventDetail = eventDetail;
    }
   /*
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    */
}
