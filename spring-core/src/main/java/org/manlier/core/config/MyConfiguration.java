package org.manlier.core.config;

import org.manlier.core.ioc.annotation.qualifier.GenericsAutowire;
import org.manlier.core.ioc.annotation.qualifier.IntegerStore;
import org.manlier.core.ioc.annotation.qualifier.StringStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by manlier on 2016/10/21.
 */
@Configuration
public class MyConfiguration {

    @Bean
    public StringStore stringStore() {
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }

    @Bean
    public GenericsAutowire genericsAutowire() {
        return new GenericsAutowire();
    }
}
