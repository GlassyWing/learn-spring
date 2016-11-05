package x.y.entities;

/**
 * Created by manlier on 2016/11/5.
 */
public class Foo {

    private String name;
    private int age;

    public Foo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
