package org.manlier.core.additional;

import org.springframework.context.MessageSource;

/**
 * Created by manlier on 2016/10/23.
 */
public class Example {

    private MessageSource messages;

    public void setMessages(MessageSource messages) {
        this.messages = messages;
    }

    public void execute() {
        String message = this.messages.getMessage("argument.required",
                new Object [] {"userDao"}, "Required", null);
        System.out.println(message);
    }
}
