package org.manlier.validation.entities;

import org.manlier.validation.annotation.NotEmpty;

/**
 * Created by manlier on 2016/10/29.
 */
public class Person {

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
