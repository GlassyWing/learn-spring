package org.manlier.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/1.
 */
//@Aspect
//@Component
public class AfterFinallyExample {

    @After("execution(* com.xyz.someapp.dao.*.*(..))")
    public void doReleaseLock() {
        System.out.println(" release resource");
    }
}
