package cn.dsq.no11.test05;

/*
如果接口的实现类（或父类的子类）只需要使用唯一的一次
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称（）{
    //覆盖重写所有抽象方法
};

匿名内部类注意事项：
1.匿名内部类，在创建对象的时候，只能使用唯一一次。
2.匿名对象是在调用方法的时候，只能调用唯一一次。
3.匿名内部类是省略了【实现类/子类】，匿名对象连【对象名称】也省略了
*/
public class CodeTest207DemoMain {
    public static void main(String[] args) {
//        CodeTest207Myinterface obj = new CodeTest207MyInterfaceImpl();
//        obj.method();


        //使用匿名内部类 , 匿名的类值的是  {.....}
        //但是这里不是匿名对象，对象名称叫objA
        CodeTest207Myinterface objA = new CodeTest207Myinterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类覆盖重写了方法,111a");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类覆盖重写了方法,222a");
            }
        };

        objA.method1();
        objA.method2();

        //使用了匿名内部类，而且省略了对象，也是匿名对象
         new CodeTest207Myinterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类覆盖重写了方法,111b");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类覆盖重写了方法,222b");
            }
        }.method1();
    }
}
