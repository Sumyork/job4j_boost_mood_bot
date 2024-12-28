package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.BeanNameAware;

@Service
public class ReminderService implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("ReminderService class name: " + name);
    }

    @PostConstruct
    public void init() {
        System.out.println("ReminderService bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ReminderService bean will be destroyed now.");
    }
}
