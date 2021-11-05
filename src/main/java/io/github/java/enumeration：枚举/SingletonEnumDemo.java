import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * 利用枚举实现单例
 * 因为枚举类的构造方法只能被声明为private权限或不声明权限
 * @author:duyunjian
 * @date:2021/09/29
 *
 */


      public class SingletonEnumDemo {

    /**
     * 内部私有枚举
     */
    private enum SingletonEnum{

        /**
         * 枚举示例（单例）
         */
        INSTANCE;

        /**
         * 枚举属性
         */
        private String name;

        public String getName(){
            return name;
        }
        public  void  setName(String name){
            this.name =name;

        }
    }
    public static void main(String[] args){
        SingletonEnum.INSTANCE.setName("soft");
        log.info(SingletonEnum.INSTANCE.getName());

    }

}
