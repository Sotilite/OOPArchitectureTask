import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.urfu.ResponseManager;

/**
 * Тестирование менеджера сообщений
 */
public class ResponseManagerTest {
    /**
     * Тест генерации ответа на сообщение пользователя
     */
    @Test
    public void generateResponseTest() {
        ResponseManager manager = new ResponseManager();
        Assertions.assertEquals(
                "Ваше сообщение: Привет, меня зовут Саша",
                manager.generateResponse("Привет, меня зовут Саша")
        );
    }
}
