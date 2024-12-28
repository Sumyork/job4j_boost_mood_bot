package ru.job4j.bmb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${telegram.bot.name}")
    private String telegramBotName;

    @Value("${telegram.bot.token}")
    private String telegramBotToken;

    public void printConfig() {
        System.out.println("Telegram Bot name: " + telegramBotName);
        System.out.println("Telegram Bot token: " + telegramBotToken);
    }
}
