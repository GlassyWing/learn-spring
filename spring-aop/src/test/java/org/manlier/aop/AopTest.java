package org.manlier.aop;

import com.xyz.someapp.dao.Dao;
import com.xyz.someapp.dao.sub.DaoImpl;
import com.xyz.someapp.entities.OrderExecute;
import com.xyz.someapp.generic.Sample;
import com.xyz.someapp.generic.sub.StringSample;
import com.xyz.someapp.service.sub.OtherService;
import com.xyz.someapp.service.sub.SomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.manlier.aop.aspect.NotVeryUsefulAspect;
import org.manlier.aop.aspect.exceptions.DataAccessException;
import org.manlier.aop.config.AppConfig;
import org.manlier.aop.introductions.UsageTracked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.Arrays;

/**
 * Created by manlier on 2016/11/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AopTest {

    @Autowired
    public ApplicationContext context;

    @Autowired
    public NotVeryUsefulAspect aspect;

    @Test
    public void testGetAspectBean() {}

    @Autowired
    public Dao dao;

    @Test
    public void testBeforeAdvice() {
        dao.execute();
    }

    @Test
    public void testAfterReturning() {
        dao.say();
    }

    @Test
    public void testAfterThrowing () {
        try {
            dao.close();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAfter() {
        dao.say();
    }

    @Test
    public void testAnnotationBinding() {
        dao.aMethod();
    }

    @Inject
    public Sample<String> stringSample;

    @Test
    public void testGenericParamBinding() {
        stringSample.sampleGenericMethod("sample generic method with param of String");
        // ! This one can't got advise
        stringSample.sampleGenericCollectionMethod(Arrays.asList("one", "two"));
    }

    @Inject
    public OrderExecute orderExecute;

    @Test
    public void testAdviceOrder() {
        orderExecute.start();
        orderExecute.end();
    }

    @Resource(name = "someService")
    private UsageTracked usageTracked;


    @Test
    public void testInstruction() {
        SomeService someService = (SomeService) usageTracked;
        someService.businessService();
    }

    @Autowired
    private OtherService otherService;

    @Test
    public void testAspectInstantiate() {
        SomeService someService = (SomeService) usageTracked;
        someService.businessService();
        otherService.businessService();
    }
}
