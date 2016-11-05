package org.manlier.validation;


import org.junit.Test;
import org.manlier.validation.entities.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by manlier on 2016/10/29.
 */
public class ValidationTest {

    @Test
    public void testBaseValidate() {
        Employee employee = new Employee();
        employee.setName("Zhang Guan Nan");
        validate(employee);
    }

    @Test
    public void testMultiValConstraint() {
        Employee employee = new Employee();
        employee.setPlace("C");
        validate(employee);
    }

    @Test
    public void testObjGraph() {
        Person person = new Person();
        Order order = new Order();
        order.setPerson(person);
        validate(order);
    }

    @Test
    public void testGroup() {
        User user = new User();
//        validate(user, GroupA.class);
        validate(user);
    }

    @Test
    public void testGroupInherit() {
        Dog dog = new Dog();
        validate(dog, Animal.class);
    }

    @Test
    public void testGroupSequence() {
        User user = new User();
        validate(user, Group.class);
    }

    private void validate(Object obj) {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();
        Set<ConstraintViolation<Object>> set = validator.validate(obj);
        set.forEach(e -> System.out.println(e.getMessage()));
    }

    private void validate(Object obj, Class<?> group) {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();
        Set<ConstraintViolation<Object>> set = validator.validate(obj, group);
        set.forEach(e -> System.out.println(e.getMessage()));
    }
}
