package cn.dsq.no11.test4;

//如何访问重名的外部类成员变量
//如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
public class CodeTest204Outer {

    int num =10;    //外部类成员变量

    public class CodeTest204Inner{
        int num =20;    //内部类成员变量


        public void methodInner(){
            int num = 30;   //内部类局部变量
            System.out.println(num);    //内部类局部变量，就近原则
            System.out.println(this.num);   //内部类成员变量
            System.out.println(CodeTest204Outer.this.num);      //外部类成员变量
        }
    }
}
