package org.manlier.core.config;

import org.manlier.core.annotation.biz.JsrDependencyTest;
import org.manlier.core.annotation.biz.MyService;
import org.manlier.core.annotation.biz.MyServiceImpl;
import org.manlier.core.annotation.biz.repository.AccountRepository;
import org.manlier.core.annotation.lookup.AsyncCommand;
import org.manlier.core.annotation.lookup.CommandManager;
import org.manlier.core.ioc.lookup.Command;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by manlier on 2016/10/22.
 */
@Configuration
@ComponentScan(basePackages = {"org.manlier.core.annotation"})
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }

    @Bean
    @Scope("prototype")
    public AsyncCommand asyncCommand() {
        AsyncCommand command = new AsyncCommand();
        return command;
    }

    @Bean
    public CommandManager commandManager() {
        return new CommandManager() {
            @Override
            protected Command createCommand() {
                return asyncCommand();
            }
        };
    }

    @Bean("jsr")
    public JsrDependencyTest jsrDependencyTest() {
        return new JsrDependencyTest();
    }
}
