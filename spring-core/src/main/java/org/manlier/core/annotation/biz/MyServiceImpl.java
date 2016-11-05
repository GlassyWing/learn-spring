package org.manlier.core.annotation.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by manlier on 2016/10/22.
 */
@Service
public class MyServiceImpl implements MyService {

    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    @Override
    public void doStuff() {
        System.out.println("MyServiceImpl biz");
    }
}
