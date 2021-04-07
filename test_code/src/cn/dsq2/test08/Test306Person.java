package cn.dsq2.test08;

public class Test306Person {
    private String name;

    public void run(){
        //循环20次
        for (int i = 0; i < 21; i++) {
            System.out.println(name+i);
        }
    }

    public Test306Person(String name) {
        this.name = name;
    }

    public Test306Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
