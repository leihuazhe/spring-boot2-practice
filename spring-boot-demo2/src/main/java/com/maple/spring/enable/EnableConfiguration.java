package com.maple.spring.enable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author maple 2018.10.03 1:35 PM
 */
@Configuration
public class EnableConfiguration {

    @Bean
    public Person build() {
        return new Person("maple", 26);
    }
}
