package org.manlier.aop.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.manlier.aop.aspect.exceptions.DataAccessException;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/1.
 */
//@Aspect
//@Component
public class AfterThrowingExample {

//
    @AfterThrowing(
            pointcut="execution(* com.xyz.someapp.dao.*.*(..))",
            throwing="ex")
    public void doRecoveryActions(DataAccessException ex) {
        System.out.println("after thrown exception: " + ex);
    }
}
