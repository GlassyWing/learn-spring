package org.manlier.core.ioc.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.*;

/**
 * Created by manlier on 2016/10/19.
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor, BeanFactoryPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before initialization: " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After initialization: " + bean);
        return bean;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition definition = beanFactory.getBeanDefinition("command");
        System.out.println("post process bean factory");
//        System.out.println(definition);

    }
}
