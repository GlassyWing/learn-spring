package org.manlier.validation.entities;

import org.manlier.validation.annotation.NotEmpty;

/**
 * Created by manlier on 2016/10/29.
 */
public class Dog implements Animal {

    private String name;
    private String ownername;

    private String type;

    public void setType(String type) {
        this.type =type;
    }

    @NotEmpty(message = "type of the dog may be empty")
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getOwnerName() {
        return null;
    }
}
