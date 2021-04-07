package cn.dsq2.test10;

public class Test340Person {
    private String name;
    private int age;

    public Test340Person() {
    }

    public Test340Person(String name, int age) {
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
        return "Test340Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
