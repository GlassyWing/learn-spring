package org.manlier.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by manlier on 2016/11/1.
 */
//@Component
@Aspect
public class SystemArchitecture {

    /**
     * 如果方法是在com.xyz.someapp.web包或其下的任何子包中定义的类型中，则连接点位于Web层中。
     */
    @Pointcut("within(com.xyz.someapp.web..*)")
    public void inWebLayer() {}

    /**
     * 如果方法是在com.xyz.someapp.service包或其下的任何子包中定义的类型中，则连接点位于服务层中。
     */
    @Pointcut("within(com.xyz.someapp.service..*)")
    public void inServiceLayer() {}

    /**
     * 如果方法是在com.xyz.someapp.dao包或其下的任何子包中的类型中定义的，则连接点位于数据访问层中。
     */
    @Pointcut("within(com.xyz.someapp.dao..*)")
    public void inDataAccessLayer() {}

    /**
     * 业务服务是在服务接口上定义的任何方法的执行。
     * 该定义假定接口放置在“服务”包中，并且实现类型在子包中。
     * 如果按功能区域对服务接口进行分组 ，
     * (例如，在com.xyz.someapp.abc.service和com.xyz.someapp.def.service包中），
     * 那么切入点表达式“execution（* com.xyz.someapp..service.*.*（..））”可以代替。
     * 或者，您可以使用'bean'PCD写入表达式，如“bean（* Service）”。
     * （这假设你已经以一致的方式命名了你的Spring服务bean。）
     */
    @Pointcut("execution(* com.xyz.someapp..service.*.*(..))")
    public void businessService() {}

    /**
     * 数据访问操作是在dao接口上定义的任何方法的执行。
     * 这个定义假定接口放在“dao”包中，并且实现类型在子包中。
     */
    @Before("execution(* com.xyz.someapp.dao.*.*(..))")
    public void dataAccessOperation() {}
}
