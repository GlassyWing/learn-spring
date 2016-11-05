package org.manlier.core.ioc.lifecycle;

/**
 * Created by manlier on 2016/10/20.
 */
public class PhaseTest {

    private String name;

    public void init() {
        System.out.println("Init PhaseTest");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhaseTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
