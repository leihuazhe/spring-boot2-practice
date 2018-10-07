package com.maple.spring.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author maple 2018.10.06 2:48 PM
 * @see ApplicationStartedEvent
 */
@Component
public class HelloApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("========>    HelloApplicationStartedListener event==> " + event.getApplicationContext());
    }
}
