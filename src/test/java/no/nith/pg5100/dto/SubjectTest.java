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
public class SubjectTest {
    private Validator validator;

    @Before
    public void setUp() throws Exception {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void nullValueSubject() throws Exception {
        Subject subject = new Subject();

        Set<ConstraintViolation<Subject>> violations = validator.validate(subject);
        assertEquals(1, violations.size());
    }

    @Test
    public void invalidSubject() throws Exception {
        Subject subject = new Subject();
        Set<ConstraintViolation<Subject>> violations = validator.validate(subject);
        assertEquals(1, violations.size());
    }

    @Test
    public void validSubject() throws Exception {
        Subject subject = new Subject();
        subject.setName("IOS");

        Set<ConstraintViolation<Subject>> violations = validator.validate(subject);
        assertTrue(violations.isEmpty());
    }
}