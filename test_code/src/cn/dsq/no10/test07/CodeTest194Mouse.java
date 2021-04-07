package cn.dsq.no10.test07;


//鼠标
public class CodeTest194Mouse implements CodeTest194USB{
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");

    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
