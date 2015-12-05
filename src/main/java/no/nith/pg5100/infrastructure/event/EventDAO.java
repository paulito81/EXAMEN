package no.nith.pg5100.infrastructure.event;

import no.nith.pg5100.dto.Event;

import java.util.List;

/**
 * Created by Paul on 03.12.2015.
 */
public interface EventDAO {

        Event persistEvent(Event event);
        List<Event> getAllEvents();
        Event detailedEvent(int id);
}
