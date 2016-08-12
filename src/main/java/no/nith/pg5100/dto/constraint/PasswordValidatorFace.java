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
@FacesValidator("no.nith.dto.constraint.PasswordValidatorFace")
public class PasswordValidatorFace implements Validator {

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^+&=])(?=\\S+$).{8,}$";
    private Pattern pattern;
    private Matcher matcher;

    public PasswordValidatorFace() {
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object passwordValue) throws ValidatorException {

        matcher = pattern.matcher(passwordValue.toString());
        if (!matcher.matches()) {

            FacesMessage message = new FacesMessage("Password validation failed.", "Invalid password must include small,large letters, signs and numbers");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
}
