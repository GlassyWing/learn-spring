package x.y.service;

import x.y.entities.Foo;

/**
 * Created by manlier on 2016/11/5.
 */
public class DefaultFooService implements FooService {

    @Override
    public Foo getFoo(String fooName, int age) {
        return new Foo(fooName, age);
    }
}
