package org.manlier.core.config;

import org.manlier.core.annotation.biz.repository.AccountRepository;
import org.manlier.core.annotation.biz.repository.JdbcAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by manlier on 2016/10/22.
 */
@Configuration
public class RepositoryConfig {

    private final DataSource dataSource;

    // There is no need to specify @Autowired if the target bean defines only one constructor
//    @Autowired
    public RepositoryConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public AccountRepository accountRepository(/*DataSource dataSource*/) {
        return new JdbcAccountRepository(dataSource);
    }
}
