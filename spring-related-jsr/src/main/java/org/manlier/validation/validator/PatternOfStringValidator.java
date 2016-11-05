package org.manlier.validation.validator;

import org.manlier.validation.annotation.PatternOfString;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by manlier on 2016/10/29.
 */
public class PatternOfStringValidator implements ConstraintValidator<PatternOfString, String > {

    private String letterIn;

    @Override
    public void initialize(PatternOfString constraintAnnotation) {
        letterIn = constraintAnnotation.mustContainLetter();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.contains(letterIn);
    }
}
