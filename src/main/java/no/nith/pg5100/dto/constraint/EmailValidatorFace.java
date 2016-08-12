package no.nith.pg5100.dto.constraint;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by phasf on 12.08.2016.
 */
@FacesValidator("no.nith.pg5100.dto.constraint.EmailValidatorFace")
public class EmailValidatorFace implements Validator {
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\."+"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*"+ "(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
    private Matcher matcher;

    public EmailValidatorFace() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object passwordValue) throws ValidatorException {

        matcher = pattern.matcher(passwordValue.toString());
        if (!matcher.matches()) {

            FacesMessage message = new FacesMessage("Email validation failed.", "Invalid E-mail format");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
}
