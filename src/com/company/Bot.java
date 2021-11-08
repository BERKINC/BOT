package com.company;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;



public class Bot extends DefaultAbsSender{
    public Bot(DefaultBotOptions options) {
        super(options);
        System.out.println("Hello");
    }

    @Override
    public String getBotToken() {
        return "2044534581:AAHxO1nTQGT6G6XRZpFn4nSHCj3bohi4Qcw";
    }

    @SneakyThrows
    public static void main(String[] args) {
        Bot bot = new Bot(new DefaultBotOptions());
        bot.execute(SendMessage.builder().chatId("406903021").text("Hello").build());
    }
}
