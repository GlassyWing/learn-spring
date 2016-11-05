package org.manlier.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/3.
 */
@Aspect
@Component
@Order(1)
public class OrderOneAspect {

    @Before("execution(* com.xyz.someapp.entities.OrderExecute.start())")
    public void beforeAdvice() {
        System.out.println("before start with advice of " + this);
    }

    @After("execution(* com.xyz.someapp.entities.OrderExecute.end())")
    public void afterAdvice() {
        System.out.println("after end with advice of " + this);
    }

}
