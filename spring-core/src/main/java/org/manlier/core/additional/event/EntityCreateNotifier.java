package org.manlier.core.additional.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

/**
 * Created by manlier on 2016/10/23.
 */
public class EntityCreateNotifier {

    @EventListener
    public void onPersonCreate(EntityCreatedEvent<Person> personEntityCreatedEvent) {
        System.out.println(personEntityCreatedEvent);
    }
}
