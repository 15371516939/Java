package annotation;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 20:59:00
 */
@FunctionalInterface
public interface GreetingService {
    /**
     * 抽象⽅法
     *
     * @param message ⼊参
     */
    void sayMessage(String message);
}