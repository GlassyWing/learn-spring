package org.manlier.aop.introductions;

/**
 * Created by manlier on 2016/11/3.
 */
public class DefaultUsageTracked implements UsageTracked {

    private int useCount;

    @Override
    public void incrementUseCount() {
        useCount++;
    }

    public int getUseCount() {
        return useCount;
    }

    @Override
    public String toString() {
        return "DefaultUsageTracked{" +
                "useCount=" + useCount +
                '}';
    }
}
