package io.github.java.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @description: Student类
 * @author: duyunjian
 * @date: 2021/10/18
 */

public class Student implements Serializable {
    private static final long serialVersionUID = -4392658638228508589L;
    private String name;
    private Integer age;
    private Integer score;
    private transient String passwd;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public String getPasswd(){
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 判断控制
     */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, IllegalAccessException {
        //调用默认的反序化函数
        objectInputStream.defaultReadObject();
        //手工检查反序列化后学生成绩的有效化，若发现有问题，即终止操作！
        if(0 > score || 100 < score) {
            throw new IllegalAccessException("学生分数只能有0到100之间！");
        }
    }



    @Override
    public String toString() {
        return "Student:" + '\n' +
                "name = " + this.name + '\n' +
                "age = " + this.age + '\n' +
                "score = " + this.score + '\n';
    }
}