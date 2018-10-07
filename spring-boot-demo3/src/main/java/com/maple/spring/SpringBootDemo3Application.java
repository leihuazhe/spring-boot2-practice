package com.maple.spring;

import com.maple.spring.initializer.AfterHelloWorldApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author maple
 */
@SpringBootApplication
public class SpringBootDemo3Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootDemo3Application.class)
                .initializers(new AfterHelloWorldApplicationContextInitializer())
                .run(args);
    }
}
