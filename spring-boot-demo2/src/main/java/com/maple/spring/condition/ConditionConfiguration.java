package com.maple.spring.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author maple 2018.10.03 12:44 PM
 */
@Configuration
public class ConditionConfiguration {


    @Bean("helloBean")
    @ConditionalOnSystemProperties(name = "user.name", value = "maple")
    public String helloBean() {
        return "=====>  Hello,Spring Condition Bean ";
    }




}


