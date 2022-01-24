package ru.veles.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.veles.spring.core.configs.AppConfig;
import ru.veles.spring.core.model.DemoBean;
import ru.veles.spring.core.services.ProductService;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoBean d = context.getBean("demoBean", DemoBean.class);
        System.out.println(d.getTitle());
        System.out.println(d.getClass());
        System.out.println(DemoBean.class);

        ProductService pd = context.getBean("productService", ProductService.class);
        System.out.println(pd.getAll());
        System.out.println(pd.calculateAverageCost());

        context.close();
    }
}
