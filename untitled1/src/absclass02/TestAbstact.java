package absclass02;

/**
 * @description: 将设计和实现分离（官方）
 * @author duyunjian
 * @date 2021/10/21
 */
public  abstract class TestAbstact {
    private String name;


    public void test() {
        System.out.println("抽象类中的普通方法");
    }

    /**
     * 抽象方法
     */

    public abstract void run();
}
