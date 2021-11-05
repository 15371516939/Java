package io.github.java.basic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

/**
 * @description: 通过反射获取注解
 * @author duyunjian
 * @date 2021/10/10
 */
@Slf4j
public class MyFieldTest {
    private static MyField annotation;
    /**
     * 使用自定义注解
     *
     */
    @MyField(description = "学习之路", length =12)
    private String username;

    public static void main(String[] args){
        //获取类模板
        Class<MyFieldTest> c = MyFieldTest.class;

        //获取所有学校
        for (Field f: c.getDeclaredFields()){
            //判断这个字段是否有MyField注解
            if (f.isAnnotationPresent(io.github.java.basic.MyField.class)){
                io.github.java.basic.MyField annotation = f.getAnnotation(io.github.java.basic.MyField.class);
                log.info("字段:{}.描述:{},长度:{}",f.getName(),annotation.description(),annotation.length());
            }
        }
    }
}
