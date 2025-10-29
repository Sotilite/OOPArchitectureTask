import org.junit.Assert;
import org.junit.Test;
import ru.urfu.ResponseManager;

public class ResponseManagerTest {
    @Test
    public void generateResponseTest() {
        String userMessage = "Привет, меня зовут Саша";

        ResponseManager manager = new ResponseManager();
        String actualResponse = manager.generateResponse(userMessage);

        String expectedResponse = String.format("Ваше сообщение: %s", userMessage);
        Assert.assertEquals(expectedResponse, actualResponse);
    }
}
