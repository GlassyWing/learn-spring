package org.manlier.entity;

import java.util.Date;

/**
 * Created by manlier on 2016/10/27.
 */
public class Employee {

    private String name;

    private float salary;

    private Date hireday;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    public Date getHireday() {
        return hireday;
    }

    public void setHireday(Date hireday) {
        this.hireday = hireday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireday=" + hireday +
                '}';
    }

}
