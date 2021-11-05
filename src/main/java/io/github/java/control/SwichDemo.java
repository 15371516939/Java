import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * @Description:swith之case穿透
 * @author：duyunjian
 * @date：2021/10/1
 */

public class SwichDemo {
    public static void main(String[] args){
        int i=0;
        int j=-1;
        switch (i){
            case 0:
                j=1;
            case 1:
                j=1;
            case 2:
                j=2;

        }
        log.info("j={}",j);
    }
}
