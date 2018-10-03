package com.maple.spring.condition;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author maple 2018.10.03 12:46 PM
 */
@ComponentScan("com.maple.spring.condition")
public class ApplicationMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ApplicationMain.class)
                .web(WebApplicationType.NONE)
                .run(args);

        Object helloBean = applicationContext.getBean("helloBean");

        System.out.println(helloBean);


        applicationContext.close();

    }
}
