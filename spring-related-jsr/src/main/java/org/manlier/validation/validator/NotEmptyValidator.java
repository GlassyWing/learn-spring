package org.manlier.validation.validator;

import org.manlier.validation.annotation.NotEmpty;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by manlier on 2016/10/29.
 */
public class NotEmptyValidator implements ConstraintValidator<NotEmpty, String> {
    @Override
    public void initialize(NotEmpty constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return false;
        else if( value.length() < 1) return false;
        return true;
    }
}
