package com.xyz.someapp.dao.sub;

import com.xyz.someapp.annotation.Auditable;
import com.xyz.someapp.dao.Dao;
import org.manlier.aop.aspect.exceptions.DataAccessException;

/**
 * Created by manlier on 2016/11/1.
 */
public class DaoImpl implements Dao {

    public void execute() {
        System.out.println("To save some data");
    }

    public String say() {
        return "Hi";
    }

    public void close() throws DataAccessException {
        throw new DataAccessException();
    }

    @Auditable("yes")
    public void aMethod() {

    }
}
