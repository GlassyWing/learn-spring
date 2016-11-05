package org.manlier.core.annotation.biz.repository;

import javax.sql.DataSource;

/**
 * Created by manlier on 2016/10/22.
 */
public class JdbcAccountRepository implements AccountRepository {

    private DataSource dataSource;

    public JdbcAccountRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
