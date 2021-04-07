package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.time.Instant;

/**
 * @version 1.0
 * @author 段市庆
 */

public class TimerTest {
    public static void main(String[] args) {
        TimePrinter t = new TimePrinter();

        //comstruct a timer that calls the listener
        //once every second
        Timer time = new Timer(1000,t);
        time.start();

        //显示一个包含一条提示消息和OK按钮的对话框
        JOptionPane.showMessageDialog(null,"quit program");
        System.exit(0); //停止jvm



    }
}

class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("现在时间是"+ Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
        //static TOolkit getDefaultToolkit() 获得默认的工具箱子 void beep() 发出一声铃响
    }
}
