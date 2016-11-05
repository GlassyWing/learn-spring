package org.manlier.core.ioc.lookup;


/**
 * Created by manlier on 2016/10/19.
 */
public abstract class CommandManager {

    public Object process() {
        return createCommand().execute();
    }

    public abstract Command createCommand();
}
