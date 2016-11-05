package org.manlier.core.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.manlier.core.annotation.biz.*;
import org.manlier.core.annotation.biz.service.TransferService;
import org.manlier.core.annotation.lookup.CommandManager;
import org.manlier.core.config.AppConfig;
import org.manlier.core.config.SystemTestConfig;
import org.manlier.core.ioc.annotation.MovieRecommender;
import org.manlier.core.ioc.annotation.SimpleMovieLister;
import org.manlier.core.ioc.annotation.qualifier.GenericsAutowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by manlier on 2016/10/21.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AnnotationTest {

    private ApplicationContext applicationContext;

    private AnnotationConfigApplicationContext annotationConfigApplicationContext;

    public AnnotationTest() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-ioc-annotation.xml");
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    private <T> T getBean(String beanName) {
        return (T) applicationContext.getBean(beanName);
    }

    private <T> T getBean(Class<T> tClass) {
        return annotationConfigApplicationContext.getBean(tClass);
    }

    @Test
    public void testRequired() {
        SimpleMovieLister lister = getBean("simpleMovieLister");
        System.out.println(lister.getMovieFinder());
    }

    @Test
    public void testMulAutowire(){
        MovieRecommender recommender = getBean("movieRecommender");
    }

    @Test
    public void testCustomQualifier() {
        MovieRecommender recommender = getBean("movieRecommender");
        System.out.println(recommender);
    }

    @Test
    public void testGericAutowired() {
        GenericsAutowire genericsAutowire = getBean("genericsAutowire");
        System.out.println(genericsAutowire);
    }

    @Test
    public void testAnnotationConfigApplicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyServiceImpl.class, Dependency1.class, Dependency2.class);
        MyService service = context.getBean(MyService.class);
        service.doStuff();
    }

    @Test
    public void testRegisterACAC() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.manlier.core.annotation.biz");
        context.refresh();
        MyService service = context.getBean(MyService.class);
        service.doStuff();
    }

    @Test
    public void testLookup() {
        CommandManager manager = getBean(CommandManager.class);
        System.out.println(manager.process("Hello"));
        System.out.println(manager.process("good"));
    }

    @Test
    public void testImported() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SystemTestConfig.class);
        TransferService service = ctx.getBean(TransferService.class);
        service.transfer(100, "A123", "C456");
    }

    @Test
    public void testInject() {
        JsrDependencyTest jsrDependencyTest = annotationConfigApplicationContext.getBean("jsr", JsrDependencyTest.class);
        System.out.println(jsrDependencyTest.getJsrDependency());
    }
}
