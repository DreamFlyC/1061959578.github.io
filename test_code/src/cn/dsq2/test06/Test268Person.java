package cn.dsq2.test06;

import java.util.Objects;

public class Test268Person implements Comparable<Test268Person>{
    private  String name;
    private  int age;

    public Test268Person() {
    }

    public Test268Person(String name, int age) {
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
        return "Test268Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test268Person that = (Test268Person) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    //重写排序规则
    @Override
    public int compareTo(Test268Person o) {
//        return 0;
        //自定义规则，比较年龄
        return this.getAge()-o.getAge();
    }
}
