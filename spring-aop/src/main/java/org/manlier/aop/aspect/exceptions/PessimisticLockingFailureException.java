package org.manlier.aop.aspect.exceptions;

/**
 * Created by manlier on 2016/11/4.
 */
public class PessimisticLockingFailureException extends Exception {

    public PessimisticLockingFailureException() {
        super("pessimistic locking failure");
    }
}
