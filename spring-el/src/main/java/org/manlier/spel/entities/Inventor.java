package org.manlier.spel.entities;

import java.util.Date;

/**
 * Created by manlier on 2016/10/30.
 */
public class Inventor {

    private String name;

    private Date birthday;

    private String nationality;

    public Inventor() {}

    public Inventor(String name, Date birthday, String nationality) {
        this.name = name;
        this.birthday = birthday;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Inventor{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
