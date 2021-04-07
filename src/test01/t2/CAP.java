package test01.t2;

import test01.t1.Person;

public class CAP extends Person {
    public static void main(String[] args) {
//        new Person("czp").getName();  //protected方法错误的调用
        new CAP("czp").test();
    }


    public CAP(String name) {
        super(name);
    }

//    @Override
//    protected String getName() {
//        return super.getName();
//    }

    public String tellname()
    {
//        String a = new Person("czp").getName();
//        return a;   不同在不同包的类调用protected方法
//      但是可以通过子类调用父类的protected方法
        String a = new CAP("czp").getName();
        return a;
    }

}

//class lx{
//
//    public String tellname(){
//        String a =new Person("lx").getName（）; //非同一个包的类不能访问protected方法
//    }
//
//}
