package org.manlier.core.ioc.definitionInheritance;

/**
 * Created by manlier on 2016/10/19.
 */
public class TestBean {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
