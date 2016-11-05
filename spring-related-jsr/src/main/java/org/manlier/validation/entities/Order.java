package org.manlier.validation.entities;

import javax.validation.Valid;

/**
 * Created by manlier on 2016/10/29.
 */
public class Order {

    @Valid
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
