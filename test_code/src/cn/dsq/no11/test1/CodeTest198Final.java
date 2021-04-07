package cn.dsq.no11.test1;



public class CodeTest198Final {
    public static void main(String[] args) {
        int num = 10;
        //一旦使用final 用来修饰局部变量，那么这个变量就不能进行更改。
        final int num2 = 20;

        num=30;
//        num2=40;  //错误写法，final修饰后的常量不能变更

        //正确写法，只要保证有唯一一次赋值即可。 区分成员变量，成员变量一定义就要赋值
        final int num3;
        num3 =300;

         //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址不可改变
        CodeTest198Student stu1 = new CodeTest198Student();
        stu1.setName("赵丽颖");
        System.out.println(stu1);
        stu1 = new CodeTest198Student("霍建华");
        System.out.println(stu1);
        //2次赋值，地址不变动

        final CodeTest198Student stu2 =new CodeTest198Student("高圆圆");
//        stu2 = new CodeTest198Student(在“赵又廷);  //错误写法

        System.out.println(stu2);
        System.out.println(stu2.getName());
        stu2.setName("赵又廷");
        System.out.println(stu2);
        System.out.println(stu2.getName());
        //地址一样，但是name改变了


    }
}
























