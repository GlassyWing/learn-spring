package org.manlier.core.annotation.lookup;

import org.manlier.core.ioc.lookup.Command;

/**
 * Created by manlier on 2016/10/22.
 */
public abstract class CommandManager {

    public Object process(Object commandState) {

        Command command = createCommand();

        command.setState(commandState);

        return command.execute();
    }

    protected abstract Command createCommand();
}
