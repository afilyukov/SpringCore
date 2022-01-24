package ru.veles.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoBean d = context.getBean("demoBean", DemoBean.class);
        System.out.println(d.getTitle());
        System.out.println(d.getClass());
        System.out.println(DemoBean.class);

        context.close();
    }
}
