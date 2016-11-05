package org.manlier.validation.entities;

import org.manlier.validation.annotation.NotEmpty;
import org.manlier.validation.annotation.PatternOfString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by manlier on 2016/10/29.
 */
public class Employee {

    @NotNull(message = "The id of employee can not be null")
    private Integer id;

    @NotNull(message = "The name of employee can not be null")
    @Size(min = 1, max = 10, message = "The size of employee's name must between 1 and 10")
    private String name;

    @NotEmpty(message = "The company of employee can not be empty")
    private String company;

    @PatternOfString.List({
            @PatternOfString(mustContainLetter = "CH",
            message = "It does not belong to China"),
            @PatternOfString(mustContainLetter = "MainLand",
            message = "It does not belong to MainLand")
    })
    private String place;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
