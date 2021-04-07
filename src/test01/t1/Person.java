package test01.t1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    protected String name;

    public Person(String name)
    {
        this.name = name;
    }
    protected String getName() {
        return name;
    }

    protected void test(){
        System.out.println("protected测试");
    }
}

class Dsq extends Person{
    public Dsq(String name) {
        super(name);
    }

    public String tellname()
    {
        String a = new Person("dsq").getName();
        return a;
    }

}

class lx2{

    public String tellname(){
        String a =new Person("lx").getName();
        return a;
    }
}