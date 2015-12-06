package no.nith.pg5100.dto;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.sql.Timestamp;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Paul on 06.12.2015.
 */
public class EventDetailTest {

    private Validator validator;

    @Before
    public void setUp() throws Exception {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void nullValuesEventDetail() throws Exception {
        EventDetail event = new EventDetail();

        Set<ConstraintViolation<EventDetail>> violations = validator.validate(event);
        assertEquals(2, violations.size());
    }
    @Test
    public void invalidEventDetail() throws Exception {
        EventDetail event = new EventDetail();
        Set<ConstraintViolation<EventDetail>> violations = validator.validate(event);
        assertEquals(2, violations.size());
    }

    @Test
    public void validEventDetail() throws Exception {
        EventDetail event = new EventDetail();
        event.setStartPoint(Timestamp.valueOf("2016-01-14 08:00:00"));
        event.setStopPoint(Timestamp.valueOf("2016-01-14 15:00:00"));

        Set<ConstraintViolation<EventDetail>> violations = validator.validate(event);
        assertTrue(violations.isEmpty());
    }
}
