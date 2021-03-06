package no.nith.pg5100.infrastructure.location;

import junit.framework.Assert;
import no.nith.pg5100.dto.Location;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JpaLocationDaoIT {
    private EntityManagerFactory factory;
    private EntityManager entityManager;
    private JpaLocationDao locationDao;

    @Before
    public void setUp() throws Exception {
        factory = Persistence.createEntityManagerFactory("pg5100-lms");
        entityManager = factory.createEntityManager();
        locationDao = new JpaLocationDao(entityManager);
    }

    @After
    public void tearDown() throws Exception {
        entityManager.close();
        factory.close();
    }

    @Test
    public void persist() throws Exception {
        Location location = new Location();
        location.setBuilding("Rådhuset");
        location.setRoom("201");

        entityManager.getTransaction().begin();
        Location result = locationDao.persistLocation(location);
        entityManager.getTransaction().commit();

        assertTrue(result.getId() > 0);
    }

    @Test
    public void findById() throws Exception {
        Location location = locationDao.findById(1);
        assertEquals("82", location.getRoom());
    }

    @Test
    public void getAll() throws Exception {
        List<Location> locations = locationDao.getAll();
        assertEquals(2, locations.size());
    }

    @Test
    public void removeLocation() throws Exception{
        Location location = locationDao.findById(1);
        boolean removed = locationDao.removeLocation(location.getId());

        Assert.assertTrue(removed);
    }

    @Test
    public void getAllDetachdLocations()throws Exception{
        List<Location> locations = locationDao.getAllDetachedLocations();
        Assert.assertTrue(locations.size() > 0);
    }
}