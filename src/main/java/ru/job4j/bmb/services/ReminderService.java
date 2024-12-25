package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class ReminderService {
    @PostConstruct
    public void init() {
        System.out.println("ReminderService bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ReminderService bean will be destroyed now.");
    }
}
