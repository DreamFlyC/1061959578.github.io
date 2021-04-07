package cn.dsq.no11.test4;

/*
局部内部类，如果希望访问所在方法的局部变量吗，那么这个局部变量必须是有效final的

备注：从java8+开始，只要局部变量事实不变，那么final关键字可以省略

原因：
1.new 出来的对象在堆内存当中
2.局部变量是跟着方法走的，在栈内存当中
3.方法运行结束之后，立刻出栈，局部变量就会立刻消失
4.但是new出来的对象会在堆当中持续存在，直到垃圾回收消失
*/
public class CodeTest206MyOuter {

    public void methodOuter(){
        final int num=10;
//        num =20; // 错误写法 会导致内部类里面的num 出错

        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
