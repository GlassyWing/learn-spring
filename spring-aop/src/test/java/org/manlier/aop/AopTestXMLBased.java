package org.manlier.aop;

import com.xyz.someapp.dao.Dao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.manlier.aop.aspect.exceptions.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import x.y.service.FooService;

/**
 * Created by manlier on 2016/11/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-aop.xml")
public class AopTestXMLBased {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private Dao dao;

    @Test
    public void testBeforeAdvice() {
        dao.execute();
    }

    @Test
    public void testAfterReturning() {
        dao.say();
    }

    @Test
    public void testAfterThrowing() {
        try {
            dao.close();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAfterFinally() {
        dao.execute();
    }

    @Test
    public void testParamBinding() {
        dao.aMethod();
    }

    @Autowired
    private FooService fooService;

    @Test
    public void testAroundAdvice() {
        fooService.getFoo("aho", 14);
    }
}
