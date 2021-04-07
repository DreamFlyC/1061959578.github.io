package cn.dsq.no10.test07;

public class Computer {

    public void poweron(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    public void useDevice(CodeTest194USB usb){
        usb.open();
        if(usb instanceof CodeTest194Mouse){
            CodeTest194Mouse monse =(CodeTest194Mouse)usb;  //向下转型
            monse.click();
        }else if(usb instanceof CodeTest194Keyboard){
            CodeTest194Keyboard keyboard =(CodeTest194Keyboard)usb;
            keyboard.type();
        }

        usb.close();
    }
}
