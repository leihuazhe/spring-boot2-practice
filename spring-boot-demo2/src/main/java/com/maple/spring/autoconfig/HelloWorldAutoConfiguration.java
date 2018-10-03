package com.maple.spring.autoconfig;

import com.maple.spring.condition.ConditionalOnSystemProperties;
import com.maple.spring.enable.EnableHelloWorld;
import org.springframework.context.annotation.Configuration;

/**
 * @author maple 2018.10.03 1:18 PM
 */
@Configuration
@ConditionalOnSystemProperties(name = "user.name", value = "maple")
@EnableHelloWorld
public class HelloWorldAutoConfiguration {
    // 条件判断
    // Enable 模块

}