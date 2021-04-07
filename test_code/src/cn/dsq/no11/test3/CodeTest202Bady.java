package cn.dsq.no11.test3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CodeTest202Bady {

    private String name;

    //外部类方法
    public void method(){
        System.out.println("外部类的方法");
        //创建内部类对象
        Heart heat = new Heart();
        heat.beat();
    }

    public class Heart{ //成员内部类
        public void beat(){
            System.out.println("心脏跳动，咚咚咚");
            System.out.println("我叫"+name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
