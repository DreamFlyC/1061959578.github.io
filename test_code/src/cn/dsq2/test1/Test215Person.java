package cn.dsq2.test1;

import java.util.Objects;

public class Test215Person {

    private String name;
    private int age;

    public Test215Person() {
    }

    public Test215Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
        直接答应对象的地址值没有意义，所有我们需要重写object类的toSting方法
        打印对象的属性(name,age)
    */

    @Override
    public String toString() {
        return "Test215Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
        Object类的equals方法默认比较的是两个对象的地址值 this == obj
        所以我们需要重写equals方法，比较对象的属性
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //也可用用instanceof 来判断类型 if  o instanceOf Test215Person, 再对o进行向下转型
        Test215Person person = (Test215Person) o;
        return age == person.age &&
                name.equals(person.name);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Test215Person person = (Test215Person) o;
//        return age == person.age &&
//                Objects.equals(name, person.name);
//    }

    /*
        再JDK7中添加了一个工具类Objects， 它提供了一些静态的使用方法来操作对象，这些方法是null-save(空指针安全的),用于计算对象的hashcode、返回对象的字符串标识形式，比较两个对象。
    */

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
}
