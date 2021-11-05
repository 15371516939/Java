import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * 逻辑操作符示例
 * @author：duyunjian
 * @date：2021/09/28
 */



public class LogiclOperatorDemo {
    public static void main(String[] args){
        boolean a =true;
        boolean b =false;

        log.info("a && b ="+(a&&b));
        log.info("a || b ="+(a||b));
        log.info("!(a && b) ="+!(a&&b));


    }
}
