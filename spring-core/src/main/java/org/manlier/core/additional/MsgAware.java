package org.manlier.core.additional;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * Created by manlier on 2016/10/23.
 */
public class MsgAware implements MessageSourceAware {

    private MessageSource messageSource;

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void execute() {
        String message = messageSource.getMessage("message", null, "Default", null);
        System.out.println(message);
    }
}
