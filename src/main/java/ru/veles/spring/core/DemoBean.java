package ru.veles.spring.core;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DemoBean {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @PostConstruct
    public void init(){
        title = "abcd";
    }
}
