package cn.dsq.no9;

public class Fu {
    public Fu() {
    }

    public Fu(int num) {
        this.num = num;
    }

    int num = 10;

    public void Method(){
        System.out.println("父类方法执行！");
    }
    public Object Method2(){
        return null;
    }
}
