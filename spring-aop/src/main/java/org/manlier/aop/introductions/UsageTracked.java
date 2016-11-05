package org.manlier.aop.introductions;

/**
 * Created by manlier on 2016/11/3.
 */
public interface UsageTracked {

    void incrementUseCount();

    int getUseCount();
}
