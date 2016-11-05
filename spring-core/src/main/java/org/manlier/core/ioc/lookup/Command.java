package org.manlier.core.ioc.lookup;

/**
 * Created by manlier on 2016/10/19.
 */
public class Command {

    private Object state;

    public String execute() {
        return state.toString();
    }

    public void setState(Object state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Command{" +
                "state=" + state +
                '}';
    }
}
