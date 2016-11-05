package org.manlier.aop.aspect;

import com.xyz.someapp.annotation.Auditable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/2.
 */
//@Aspect
//@Component
public class ParamBindingAspect {

    @Before("execution(* com.xyz.someapp.dao.*.*.aMethod(..)) && @annotation(auditable)")
    public void audit(Auditable auditable) {
        String code = auditable.value();
        System.out.println("get annotation value: " + code);
    }
}
