package no.nith.pg5100.infrastructure.subject;

import no.nith.pg5100.dto.Location;
import no.nith.pg5100.dto.Subject;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class JpaSubjectDao implements SubjectDao {

    @PersistenceContext(unitName = "pg5100-lms")
    private EntityManager entityManager;

    public JpaSubjectDao() {
    }

    JpaSubjectDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Subject persist(Subject subject) {
        entityManager.persist(subject);
        return subject;
    }

    @Override
    public Subject findById(int id) {
        return entityManager.find(Subject.class, id);
    }

    @Override
    public List<Subject> getAll() {
        TypedQuery<Subject> query = entityManager.createNamedQuery("Subject.getAll", Subject.class);
        return query.getResultList();
    }
    @Override
    public boolean removeSubject(int id) {
        if (id != 0) {
            Subject subject = entityManager.find(Subject.class, id);
            entityManager.remove(subject);
            return true;
        }
        throw new IllegalArgumentException("Value is not found :(");
    }


    @Override
    public List<Subject> getAllDetachedSubjects() {
        List<Subject> detachedSubjects = new ArrayList<>();
        List<Subject> subjects = getAll();
        for(Subject subject : subjects){
            TypedQuery<Location> query = entityManager.createNamedQuery("Location.getLocationForSubject", Location.class);
            query.setParameter("id", subject.getId());
            List<Location> locations = query.getResultList();
            if( locations.isEmpty()){
                detachedSubjects.add(subject);
            }
        }
        return detachedSubjects;
    }

}
