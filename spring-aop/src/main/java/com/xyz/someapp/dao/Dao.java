package com.xyz.someapp.dao;

import org.manlier.aop.aspect.exceptions.DataAccessException;

/**
 * Created by manlier on 2016/11/1.
 */
public interface Dao {

    void execute();

    String say();

    void close() throws DataAccessException;

    void aMethod();

}
