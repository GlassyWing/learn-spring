package org.manlier.core.additional.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by manlier on 2016/10/23.
 */
public class BlackListEvent extends ApplicationEvent {

    private final String address;
    private final String test;


    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
    }

    @Override
    public String toString() {
        return "BlackListEvent{" +
                "address='" + address + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
