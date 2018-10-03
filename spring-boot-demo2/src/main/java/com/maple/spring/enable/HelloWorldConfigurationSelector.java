package com.maple.spring.enable;

import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author maple 2018.10.03 1:29 PM
 */
public class HelloWorldConfigurationSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //加载 Bean
        return new String[]{EnableConfiguration.class.getName()};
    }
}
