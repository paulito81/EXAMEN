package no.nith.pg5100.infrastructure.event;

import no.nith.pg5100.dto.Event;
import no.nith.pg5100.dto.EventType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Paul on 06.12.2015.
 */
public class JpaEventDaoIT {
    private EntityManagerFactory factory;
    private EntityManager entityManager;
    private JpaEventDAO eventDAO;

    @Before
    public void setUp() throws Exception {
        factory = Persistence.createEntityManagerFactory("pg5100-lms");
        entityManager = factory.createEntityManager();
        eventDAO = new JpaEventDAO(entityManager);
    }

    @After
    public void tearDown() throws Exception {
        entityManager.close();
        factory.close();
    }

    @Test
    public void testPersistEvent() {
        Event event = new Event();
        event.setDescription("Apple programmering for viderekommende");
        event.setTitle("IOS Programmering");
        event.setEventtype(EventType.FORELESNING);

        entityManager.getTransaction().begin();
        Event result = eventDAO.persistEvent(event);
        entityManager.getTransaction().commit();
        System.out.println(result.getId());

        Assert.assertTrue(result.getId() > 0);

    }

    @Test
    public void testGetAllEvents() {
        List<Event> events = eventDAO.getAllEvents();
        Assert.assertEquals(5, events.size());
    }

    @Test
    public void testDetailedEvent() {
        Event event = new Event();
        Assert.assertNotNull(event);
    }

}
