package cn.dsq.no9.teat;

public class Fu1 {
    int num;
    String cc;

    public Fu1() {
        System.out.println("父类无参构造");
    }

    public Fu1(int num) {
        this.num = num;
        System.out.println("父类有参构造");
    }

    public Fu1(String cc) {
        this.cc = cc;
        System.out.println("父类有参构造,字符类型");
    }
}
