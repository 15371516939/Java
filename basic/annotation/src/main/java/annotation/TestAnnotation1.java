package annotation;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 21:06:00
 */
@TestAnnotation(id = 111, msg = "aaa")//不加注解运行啥也没有
public class TestAnnotation1 {
    public static void main(String[] args) {
        boolean hasAnnotation =
                TestAnnotation1.class.isAnnotationPresent(TestAnnotation.class);
        if (hasAnnotation) {
            TestAnnotation testAnnotation =
                    TestAnnotation1.class.getAnnotation(TestAnnotation.class);
            System.out.println("id:" + testAnnotation.id());
            System.out.println("msg:" + testAnnotation.msg());
        }
    }

}