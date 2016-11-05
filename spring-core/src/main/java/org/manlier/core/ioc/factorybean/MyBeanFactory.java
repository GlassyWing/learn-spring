package org.manlier.core.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by manlier on 2016/10/20.
 */
public class MyBeanFactory implements FactoryBean<MyBean> {

    @Override
    public MyBean getObject() throws Exception {
        return new MyBean();
    }

    @Override
    public Class<MyBean> getObjectType() {
        return MyBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
