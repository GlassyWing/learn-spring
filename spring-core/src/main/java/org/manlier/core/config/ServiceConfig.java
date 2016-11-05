package org.manlier.core.config;

import org.manlier.core.annotation.biz.repository.AccountRepository;
import org.manlier.core.annotation.biz.service.TransferService;
import org.manlier.core.annotation.biz.service.TransferServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by manlier on 2016/10/22.
 */
@Configuration
public class ServiceConfig {

    @Autowired
    private AccountRepository accountRepository;

    @Bean
    public TransferService transferService(/*AccountRepository accountRepository*/) {
        return new TransferServiceImpl(accountRepository);
    }

}
