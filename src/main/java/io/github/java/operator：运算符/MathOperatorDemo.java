import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * 算法操作符示例
 *
 * @author: duyunjian
 * @date:2021/09/28
 */


public class MathOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        log.info("a + b =" + (a + b));
        log.info("a _ b =" + (a - b));
        log.info("a * b =" + (a * b));
        log.info("b / a =" + (b / a));
        log.info("b % a =" + (b % a));
        log.info("c % a =" + (c % a));
        log.info("a + + =" + (a++));
        log.info("a - - =" + (a--));
        //查看 d++ 与++d 的不同
        log.info("d++ =" + (d++));
        log.info("++d =" + (++d));
    }
}

