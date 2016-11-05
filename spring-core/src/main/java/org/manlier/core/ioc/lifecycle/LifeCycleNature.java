package org.manlier.core.ioc.lifecycle;

import org.springframework.context.SmartLifecycle;

/**
 * Created by manlier on 2016/10/19.
 */
public class LifeCycleNature implements SmartLifecycle {

    private boolean running = false;

    @Override
    public void start() {
        System.out.println("Application start!!!");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println("Application stop!!!");
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        System.out.println("Application stop with callback!!!" + callback.getClass());
        callback.run();
    }

    @Override
    public int getPhase() {
        return 1;
    }
}
