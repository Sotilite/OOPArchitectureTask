package ru.urfu;

/**
 * Менеджер ответов на сообщения пользователей
 */
public class ResponseManager {
    /**
     * Сгенерировать ответ
     * @param message сообщение от пользователя
     */
    public String generateResponse(String message) {
        return String.format("Ваше сообщение: %s", message);
    }
}
