package cn.dsq.no10.test07;


//键盘
public class CodeTest194Keyboard implements CodeTest194USB{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");

    }

    public void type(){
        System.out.println("键盘输入");
    }

}
