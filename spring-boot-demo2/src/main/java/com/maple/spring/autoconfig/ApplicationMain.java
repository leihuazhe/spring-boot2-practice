package com.maple.spring.autoconfig;

import com.maple.spring.enable.Person;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author maple 2018.10.03 12:46 PM
 */
@EnableAutoConfiguration
public class ApplicationMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ApplicationMain.class)
                .web(WebApplicationType.NONE)
                .run(args);

        Object helloBean = applicationContext.getBean(Person.class);
        System.out.println("\n自动装配Bean：=========>  " + helloBean);
        applicationContext.close();

    }
}
