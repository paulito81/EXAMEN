package no.nith.pg5100.dto;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


/**
 * Created by Paul on 06.12.2015.
 */
@Entity
@NamedQuery(name = "EventDetail.getAllEvents", query = "select e from Event e")
@SequenceGenerator(name = "SEQ_DETAIL", initialValue = 50)
public class EventDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DETAIL")
    private int id;

    @NotNull
    private Timestamp startPoint;

    @NotNull
    private Timestamp stopPoint;

    public EventDetail( Timestamp startPoint, Timestamp stopPoint) {

        this.startPoint = startPoint;
        this.stopPoint = stopPoint;
    }

    public EventDetail(){

    }

    public int getId() {
        return id;
    }

    public void setId(int eventDetailId) {
        this.id = eventDetailId;
    }

    public Timestamp getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Timestamp startPoint) {
        this.startPoint = startPoint;
    }

    public Timestamp getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(Timestamp stopPoint) {
        this.stopPoint = stopPoint;
    }

}
