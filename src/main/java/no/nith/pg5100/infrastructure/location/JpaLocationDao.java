package no.nith.pg5100.infrastructure.location;

import no.nith.pg5100.dto.Location;
import no.nith.pg5100.dto.Subject;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class JpaLocationDao implements LocationDao {

    @PersistenceContext(unitName = "pg5100-lms")
    private EntityManager entityManager;

    public JpaLocationDao() {
    }

    JpaLocationDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Location persistLocation(Location location) {
        entityManager.persist(location);
        return location;
    }

    @Override
    public Location findById(int id) {
        return entityManager.find(Location.class, id);
    }

    @Override
    public List<Location> getAll() {
        TypedQuery<Location> query = entityManager.createNamedQuery("Location.getAll", Location.class);
        return query.getResultList();
    }
    @Override
    public List<Location> getAllDetachedLocations() {
        List<Location> detachedLocations = new ArrayList<>();
        List<Location> locations = getAll();
        for (Location location : locations) {
            TypedQuery<Subject> query = entityManager.createNamedQuery("Subject.getSubjectsForLocation", Subject.class);
            query.setParameter("id", location.getId());
            List<Subject> subjects = query.getResultList();
            if (subjects.isEmpty()) {
                detachedLocations.add(location);
            }
        }

        return detachedLocations;
    }

    @Override
    public boolean removeLocation(int id) {
        if (id != 0) {
            Location location = entityManager.find(Location.class, id);
            entityManager.remove(location);
            return true;
        }
        throw new IllegalArgumentException("Location could not be removed.. :(");
    }
}
