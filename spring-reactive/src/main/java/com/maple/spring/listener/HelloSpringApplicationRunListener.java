package com.maple.spring.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author maple 2018.10.06 4:33 PM
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {


    public HelloSpringApplicationRunListener(SpringApplication application, String[] args) {
    }

    @Override
    public void starting() {
        System.out.println("=====>HelloSpringApplicationRunListener starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("=====>HelloSpringApplicationRunListener environmentPrepared");

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("=====>HelloSpringApplicationRunListener contextPrepared");

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("=====>HelloSpringApplicationRunListener contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("=====>HelloSpringApplicationRunListener started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("=====>HelloSpringApplicationRunListener running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("=====>HelloSpringApplicationRunListener failed");
    }
}
