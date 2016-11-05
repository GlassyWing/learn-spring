package org.manlier.core.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.manlier.core.ioc.definitionInheritance.DerivedTestBean;
import org.manlier.core.ioc.factorybean.MyBean;
import org.manlier.core.ioc.factorybean.MyBeanFactory;
import org.manlier.core.ioc.lifecycle.PhaseTest;
import org.manlier.core.ioc.lookup.Command;
import org.manlier.core.ioc.lookup.CommandManager;
import org.manlier.core.ioc.methodreplacement.MyValueCalculator;
import org.manlier.core.ioc.postprocessor.PropertyOverrideTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.DefaultLifecycleProcessor;

/**
 * Created by manlier on 2016/10/19.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class IOCTest {

    private ClassPathXmlApplicationContext applicationContext;

    public IOCTest() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-ioc.xml");
    }


    @Test
    public void testLookupMethod() {
        CommandManager commandManager = applicationContext.getBean("commandManager", CommandManager.class);
        Command command = commandManager.createCommand(),
        command1 = commandManager.createCommand();
        System.out.println(command + ", " +command1);
    }

    @Test
    public void testReplacementMethod() {
        MyValueCalculator myValueCalculator = applicationContext.getBean("commandManager", MyValueCalculator.class);
        System.out.println(myValueCalculator.computeValue("Hi"));
    }

    @Test
    public void testBeanNature() {
        PhaseTest phase = applicationContext.getBean("phaseTest", PhaseTest.class);
    }

    @Test
    public void testLifeCycle() {
        applicationContext.close();
    }

    @Test
    public void testDefinitionInheritance() {
        DerivedTestBean testBean = applicationContext.getBean("inheritsWithDifferentClass",DerivedTestBean.class);
        System.out.println(testBean);
    }

    @Test
    public void testOverrideProperty() {
        PropertyOverrideTest propertyOverride = applicationContext.getBean("property_override", PropertyOverrideTest.class);
        System.out.println(propertyOverride.getProper().getName());
    }

    @Test
    public void testFactoryBean() {
        MyBean myBean = applicationContext.getBean("myBean", MyBean.class);
        MyBeanFactory beanFactory = applicationContext.getBean("&myBean", MyBeanFactory.class);
        System.out.println(myBean);
        System.out.println(beanFactory);
    }
}
