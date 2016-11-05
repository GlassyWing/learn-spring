package org.manlier.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by manlier on 2016/11/2.
 */
@Aspect
@Component
public class SampleAspect {

    @Before("execution(* com.xyz.someapp.generic..Sample+.sampleGenericMethod(*)) && args(param)")
    public void beforeSampleMethod(String param) {
        System.out.println("get type of String param: " + param);
    }

    @Before("execution(* com.xyz.someapp.generic..Sample+.sampleGenericMethod(*)) && args(param)")
    public void beforeSampleMethod(Collection<String> param) {
        System.out.println("get type of Collection<String> param: " + param);
    }
}
