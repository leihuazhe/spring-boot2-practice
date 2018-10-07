package com.maple.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author maple 2018.10.06 2:54 PM
 */
public class AnnotationContextMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.addApplicationListener(event -> {
            if (event instanceof PayloadApplicationEvent)
                System.out.println("============>   PayloadApplicationEvent：event " + ((PayloadApplicationEvent) event).getPayload());
            System.out.println("============>   监听到事件：event " + event + " : " + event.getSource());
        });



        context.refresh();

        // PayloadApplicationEvent
        context.publishEvent("HelloWorld");

        // 自定义事件
        context.publishEvent(new ApplicationEvent("小马哥") {
            @Override
            public Object getSource() {
                return "小马哥";
            }
        });


        context.close();
    }
}
