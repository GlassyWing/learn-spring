package test.base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by manlier on 2016/10/23.
 */
public class BaseTest {

    private ClassPathXmlApplicationContext classPathXmlApplicationContext;

    private AnnotationConfigApplicationContext annotationConfigApplicationContext;

    public BaseTest(String xmlPath) {
        this.classPathXmlApplicationContext = new ClassPathXmlApplicationContext(xmlPath);
    }

    public BaseTest(Class<?> config) {
        this.annotationConfigApplicationContext  = new AnnotationConfigApplicationContext(config);
    }

    protected  <T> T getBean(String beanName) {
        return (T) classPathXmlApplicationContext.getBean(beanName);
    }

    protected <T> T getBean(Class<T> tClass) {
        return annotationConfigApplicationContext.getBean(tClass);
    }

    public ClassPathXmlApplicationContext getClassPathXmlApplicationContext() {
        return classPathXmlApplicationContext;
    }

    public AnnotationConfigApplicationContext getAnnotationConfigApplicationContext() {
        return annotationConfigApplicationContext;
    }
}
