package enums;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EnumsTest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("输入尺码：(SMALL,MEDIUM,;LARGE,EXTRA_LARGE)");
        String input=in.next().toUpperCase();
        Size size =Enum.valueOf(Size.class,input);
        System.out.println(size.SMALL);
        System.out.println("size="+size);
        System.out.println("m="+size.m);
        if(size == Size.EXTRA_LARGE)
            System.out.println("good job");

    }


    enum Size
    {
        SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");


        public String m;

        private Size(String m){this.m = m;}

        public String getM() {
            return m;
        }
    }
}


