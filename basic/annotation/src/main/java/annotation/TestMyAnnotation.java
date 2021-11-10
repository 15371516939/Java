package annotation;

import java.lang.annotation.Annotation;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 20:44:00
 */
public class TestMyAnnotation {
    public static void main(String[] args) {
        Annotation[] annotations = Man.class.getAnnotations();
        System.out.println(annotations.length);
        //Persons p1 = (Persons) annotations[0];
        //for (Person t : p1.value()) {
        //    System.out.println(t.role());
        if(Man.class.isAnnotationPresent(Persons.class)) {
            Persons p2=Man.class.getAnnotation(Persons.class);
            for(Person t:p2.value()){
                System.out.println(t.role());
            }
        }

                }
            }