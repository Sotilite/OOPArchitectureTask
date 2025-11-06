package ru.urfu;

/**
 * Класс для запуска приложения
 */
public class Application {

    public static void main(String[] args) {
        ResponseManager manager = new ResponseManager();

        String telegramBotName = System.getenv("telegram_botName");
        String telegramToken = System.getenv("telegram_token");
        new TelegramBot(telegramBotName, telegramToken, manager)
                .start();

        String discordToken = System.getenv("discord_token");
        new DiscordBot(discordToken, manager)
                .start();

        /*
         тут может быть сколько угодно чат платформ
         и все должны работать одинаково
        */
    }

}
