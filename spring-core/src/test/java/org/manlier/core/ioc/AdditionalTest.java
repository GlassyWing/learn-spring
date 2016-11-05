package org.manlier.core.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.manlier.core.additional.Example;
import org.manlier.core.additional.MsgAware;
import org.manlier.core.additional.event.EmailService;
import org.manlier.core.additional.event.EntityCreatedEvent;
import org.manlier.core.additional.event.EntityService;
import org.springframework.context.MessageSource;
import test.base.BaseTest;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Locale;

/**
 * Created by manlier on 2016/10/23.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AdditionalTest extends BaseTest {

    public AdditionalTest() {
        super("classpath:spring-ioc-additional.xml");
    }

    @Test
    public void testMessageSource() {
        MessageSource source = getClassPathXmlApplicationContext();
        String message = source.getMessage("message", null, Locale.CHINA);
        System.out.println(message);

        Example example = getBean("example");
        example.execute();

        MsgAware msgAware = getBean("msgAware");
        msgAware.execute();
    }

    @Test
    public void testEvent() {
        EmailService service = getBean("emailService");
        service.sendEmail("known.spammer@example.org", "Are you ok?");
    }

    @Test
    public void testGericEvent(){
        EntityService service = getBean("entityService");
        service.createPerson();
    }

    @Test
    public void test() throws IOException {
        Enumeration<URL> urls = getClass().getClassLoader().getResources("");
        while (urls.hasMoreElements()) {
            System.out.println(urls.nextElement());
        }
    }
}
