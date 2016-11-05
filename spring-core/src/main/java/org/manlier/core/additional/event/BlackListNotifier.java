package org.manlier.core.additional.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

/**
 * Created by manlier on 2016/10/23.
 */
public class BlackListNotifier /*implements ApplicationListener<BlackListEvent>*/ {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    public void onApplicationEvent(BlackListEvent event) {
        System.out.println("Receive event: " + event);
    }

}
