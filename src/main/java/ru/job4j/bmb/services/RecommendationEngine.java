package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class RecommendationEngine {
    @PostConstruct
    public void init() {
        System.out.println("RecommendEngine bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("RecommendEngine bean will be destroyed now.");
    }
}
