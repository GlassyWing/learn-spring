package org.manlier.validate;

import org.manlier.entity.Person;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by manlier on 2016/10/27.
 */
public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class == clazz;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person p = (Person) target;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "negativevalue");
        } else if (p.getAge() > 110) {
            errors.rejectValue("age", "too.darn.old");
        }
    }
}
