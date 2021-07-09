package cn.dsq4.web1;

/**
 * @author: 段市庆
 * @date: 2021/6/16 11:32
 */
public class Test467Person {
    private String name;
    private int age;
    public  String pname;

    public Test467Person() {
    }

    public Test467Person(String name, int age) {
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

    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String food){
        System.out.println("eat...."+food);
    }

    @Override
    public String toString() {
        return "Test467Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
