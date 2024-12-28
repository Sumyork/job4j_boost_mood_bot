package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.BeanNameAware;

@Service
public class MoodService implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("MoodService class name: " + name);
    }

    @PostConstruct
    public void init() {
        System.out.println("MoodService bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MoodService bean will be destroyed now.");
    }
}
