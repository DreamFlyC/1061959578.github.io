package cn.dsq2.test13;

import java.io.Serializable;

/**
 * @author 段市庆
 * @date 2021/4/29 19:51
 */
public class Test397Person implements Serializable {
//    static final long serialVersionUID = 22L;
    private String name;
    private int age;

    public Test397Person() {
    }

    public Test397Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test397Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
