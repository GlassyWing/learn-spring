package org.manlier.core.ioc.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by manlier on 2016/10/21.
 */
public class GenericsAutowire {

    @Autowired
    private Store<String> s1; // <String> qualifier, injects the stringStore bean

    @Autowired
    private Store<Integer> s2; // <Integer> qualifier, injects the integerStore bean

    @Autowired
    private List<Store<Integer>> s;

    @Override
    public String toString() {
        return "GenericsAutowire{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                ", s=" + s +
                '}';
    }
}
