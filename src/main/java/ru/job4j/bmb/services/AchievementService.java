package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AchievementService {
    @PostConstruct
    public void init() {
        System.out.println("AchievementService bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AchievementService bean will be destroyed now.");
    }
}
