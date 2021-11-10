package annotation;
import org.junit.Test;
/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 20:59:00
 */
public class GreetingServiceTest {
    @Test
    public void testGreetingService(){
        GreetingService greetingService = message -> System.out.println("Hello" + message);
        greetingService.sayMessage("我是Java小菜鸟");
    }

}
