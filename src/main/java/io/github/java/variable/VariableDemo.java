


//package io.github.java.basic.variable;

public class VariableDemo {

    /**
     * 类变量(静态变量）
     */
    private static int staticVar = 1024;

    /**
     * 实例变量
     */
    private String instanceVar ="hello";
        /**
         * 实例方法
         */
        public void method() {
            //局部变量
            int localVar = 666;
            System.out.println("localVar before:" + localVar);
            localVar = 888;
            System.out.println("localVar after:" + localVar);
        }
        /**
         * 静态方法
         *
         * @paron args args
         */
        public static void main (String[]args){
            //访问类变量（静态变量），无需实例化对象
            System.out.println("staticVar before:" + staticVar);
            staticVar = 2048;
            System.out.println("staticVar after:" + staticVar);
            System.out.println("************************");
            //创建实例对象，访问实例变量
            VariableDemo vd = new VariableDemo();
            System.out.println("instanceVar before:" + vd.instanceVar);
            vd.instanceVar = "world";
            System.out.println("instanceVar after:" + vd.instanceVar);
            System.out.println("***********************");
            //调用实例方法
            vd.method();
        }
    }




