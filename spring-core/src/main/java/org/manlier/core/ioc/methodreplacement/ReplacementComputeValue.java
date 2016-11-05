package org.manlier.core.ioc.methodreplacement;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by manlier on 2016/10/19.
 */
public class ReplacementComputeValue implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("replaced method: " + method.getName());
        String input = (String)args[0];
        return input + 4;
    }
}
