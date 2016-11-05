package org.manlier.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/1.
 */
//@Aspect
//@Component
public class AfterReturningExample {

    @AfterReturning(value = "execution(String com.xyz.someapp.dao.*.*(..))", returning = "retVal")
    public void doAccessCheck(Object retVal) {
        System.out.println("after returning: " + retVal);
    }
}
