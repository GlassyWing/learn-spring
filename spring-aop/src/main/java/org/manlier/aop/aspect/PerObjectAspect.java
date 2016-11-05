package org.manlier.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/4.
 */
@Aspect("perthis(execution(* com.xyz.someapp.service.sub.*.businessService()))")
@Component
@Scope("prototype")
public class PerObjectAspect {

    private static int someState;

    public PerObjectAspect() {
        someState++;
    }

    @Before("execution(* com.xyz.someapp.service.sub.*.businessService())")
    public void recordServiceUsage() {
        System.out.println("some state in PerThisAspect is " + getSomeState());
    }

    public static int getSomeState() {
        return someState;
    }
}
