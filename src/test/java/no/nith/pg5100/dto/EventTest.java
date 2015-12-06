package no.nith.pg5100.dto;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Paul on 06.12.2015.
 */
public class EventTest {
    private Validator validator;

    @Before
    public void setUp() throws Exception {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void nullValusEvent() throws Exception {
        Event event = new Event();

        Set<ConstraintViolation<Event>> violations = validator.validate(event);
        assertEquals(3, violations.size());
    }

    @Test
    public void invalidEvent() throws Exception {
        Event event = new Event();
        Set<ConstraintViolation<Event>> violations = validator.validate(event);
        assertEquals(3, violations.size());
    }

    @Test
    public void validEvent() throws Exception {
        Event event = new Event();
        event.setTitle("Galleriet");
        event.setEventtype(EventType.EGENTRENING);
        event.setDescription("blabla");

        Set<ConstraintViolation<Event>> violations = validator.validate(event);
        assertTrue(violations.isEmpty());
    }
}
