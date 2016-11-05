package org.manlier.validation.biz;

import org.manlier.entity.Person;
import org.manlier.validation.entities.PersonForm;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * Created by manlier on 2016/10/29.
 */
public class MyService {

    @Resource
    private Validator validator;

    @Resource
    private PersonForm personForm;


    public void validate() {
        Set<ConstraintViolation<Object>> set= validator.validate(personForm);
        set.forEach(e -> System.out.println(e.getMessage()));
    }
}
