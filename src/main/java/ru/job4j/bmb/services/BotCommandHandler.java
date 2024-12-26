package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;
import ru.job4j.bmb.content.Content;

@Service
public class BotCommandHandler implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("BotCommandHandler class name: " + name);
    }

    @PostConstruct
    public void init() {
        System.out.println("BotCommandHandler bean is going through init.");
    }

    void receive(Content content) {
        System.out.println(content);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BotCommandHandler bean will be destroyed now.");
    }
}
