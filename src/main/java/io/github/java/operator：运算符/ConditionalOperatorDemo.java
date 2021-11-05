import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * 三目运算示例
 * @author:duyunjian
 * @date:2021/09/28
 */


public class ConditionalOperatorDemo {
    public static void main(String[] args){
        int a,b;
        a =10;
        b=(a ==1)?20:30;
        log.info("Value of b is :"+b);

        b=(a==10)?20:30;
        log.info("Value of b is:"+b);

    }
}
