package cn.dsq.no11.test1;


/*
对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变

1.由于成员变量具有默认值，所有用了final之后必须首当赋值，不会再给默认值了。
2.对于final 的成员变量，要么使用直接直接赋值，要么通过构造方法赋值，二者选其一
3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。
*/
public class CodeTest199Person {

    private  final String name ="CZP";
    public  final String name2;

    public CodeTest199Person() {
        name2 = "Lx";
    }

    public CodeTest199Person(String name) {
//        this.name = name;     //已经直接赋值，所以不能再通过构造赋值
        name2 = "Lx";
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;    已经直接赋值所以不能在改变
//    }
}
