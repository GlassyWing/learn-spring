package org.manlier.core.additional.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by manlier on 2016/10/23.
 */
public class EntityService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }

    public void createPerson() {
        Person person = new Person();
        publisher.publishEvent(new EntityCreatedEvent<>(person));
    }
}
