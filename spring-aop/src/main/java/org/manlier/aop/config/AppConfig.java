package org.manlier.aop.config;

import com.xyz.someapp.dao.sub.DaoImpl;
import com.xyz.someapp.entities.OrderExecute;
import com.xyz.someapp.generic.sub.StringSample;
import com.xyz.someapp.service.sub.OtherService;
import com.xyz.someapp.service.sub.SomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by manlier on 2016/11/1.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "org.manlier.aop.*")
public class AppConfig {

    @Bean
    public DaoImpl dao() {
        return new DaoImpl();
    }

    @Bean
    public StringSample stringSample() {
        return new StringSample();
    }

    @Bean
    public OrderExecute orderExecute() {
        return new OrderExecute();
    }

    @Bean
    public SomeService someService() {
        return new SomeService();
    }

    @Bean
    public OtherService otherService() {
        return new OtherService();
    }
}
