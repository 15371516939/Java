import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * 关系操作符示例
 * @author:duyunjian
 * @date:2021/09/28
 *
 */




public class RelationOperatorDemo {
    public static void main(String[] args){
        int x =20;
        int y =10;
        log.info("x ==y ="+(x==y));
        log.info("x!=y="+(x!=y));
        log.info("x>y="+(x>y));
        log.info("x<y="+(x<y));
        log.info("x>=y="+(x>=y));
        log.info("x<=y="+(x<=y));

    }
}
