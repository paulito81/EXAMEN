package no.nith.pg5100.infrastructure.event;

import no.nith.pg5100.dto.Event;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


/**
 * Created by Paul on 03.12.2015.
 */
@Stateless
public class JpaEventDAO implements EventDAO {

    @PersistenceContext(unitName = "pg5100-lms")
    private EntityManager entityManager;

    public JpaEventDAO(){

    }

    public JpaEventDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Event persistEvent(Event event) {
        if (event ==null)
            throw new IllegalArgumentException("No event could be created =(");

         entityManager.persist(event);
         return event;
    }

    @Override
    public List<Event> getAllEvents() {
        TypedQuery<Event> query = entityManager.createNamedQuery("Event.getAllEvents", Event.class);
        return query.getResultList();
    }

    @Override
    public Event detailedEvent(int id) {
        if (id != 0) {
            return entityManager.find(Event.class, id);
        } else
            throw new IllegalArgumentException("No event where found");
    }
}
