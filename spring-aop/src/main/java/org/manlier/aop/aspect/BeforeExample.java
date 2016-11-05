package org.manlier.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/1.
 */
//@Aspect
//@Component
public class BeforeExample {

    @Before("execution(* com.xyz.someapp.dao.*.*(..))")
    public void doAccessCheck() {
        System.out.println("do access check");
    }
}
