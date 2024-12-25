package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MoodService {
    @PostConstruct
    public void init() {
        System.out.println("MoodService bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MoodService bean will be destroyed now.");
    }
}
