package org.manlier.aop.introductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/3.
 */
@Aspect
@Component
public class UsageTracking {

    @DeclareParents(value="com.xyz.someapp.service.sub.*+", defaultImpl=DefaultUsageTracked.class)
    public static UsageTracked mixin;


    @Before("execution(* com.xyz.someapp.service.sub.SomeService.businessService()) && this(usageTracked)")
    public void recordUsage(UsageTracked usageTracked) {
        usageTracked.incrementUseCount();
    }
}
