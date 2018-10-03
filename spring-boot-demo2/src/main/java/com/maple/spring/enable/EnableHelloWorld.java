package com.maple.spring.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author maple 2018.10.03 1:27 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(EnableConfiguration.class)
public @interface EnableHelloWorld {

}
