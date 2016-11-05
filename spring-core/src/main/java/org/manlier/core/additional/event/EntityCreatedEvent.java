package org.manlier.core.additional.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

/**
 * Created by manlier on 2016/10/23.
 */
public class EntityCreatedEvent<T> extends ApplicationEvent
    implements ResolvableTypeProvider{
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public EntityCreatedEvent(T source) {
        super(source);
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(getClass(),
                ResolvableType.forInstance(getSource()));
    }
}
