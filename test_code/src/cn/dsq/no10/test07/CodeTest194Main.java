package cn.dsq.no10.test07;

public class CodeTest194Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.poweron();

        //准备一个鼠标
        CodeTest194Mouse mouse = new CodeTest194Mouse();
        //首先向上转型
        CodeTest194USB usb =mouse;
        //准备键盘
        CodeTest194USB usb2 = new CodeTest194Keyboard();

        //使用usb社保
        computer.useDevice(mouse);  //自动向上转型  小范围可以自动转换为大范围的
        computer.useDevice(usb);
        computer.useDevice(usb2);
        computer.powerOff();
    }
}
