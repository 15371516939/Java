import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * 本例展示枚举状态机
 * @author：duyunjian
 * @date：2021/09/29
 */

public class StateMachine {

    public static String getTrafficInstruct(Signal signal) {
        String instruct = "信号灯故障";
        switch (signal) {
            case RED:
                instruct = "红灯停";
                break;
            case YELLOW:
                instruct = "黄灯请注意";
            case GREEN:
                instruct = "绿灯行";
            default:
                break;
        }
        return instruct;
    }

    public  static void main(String[] args){
        log.info(getTrafficInstruct(Signal.RED));
        log.info(getTrafficInstruct(Signal.YELLOW));
        log.info(getTrafficInstruct(Signal.GREEN));



        }
    }

