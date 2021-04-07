package cn.dsq2.test06;


/*
    可变参数：
        在JDK1.5之后，如果我们定义一个方法需要接受多个参数，并且多个参数类型一致，我们可以对其简化成如下格式
        修饰符 返回值类型 方法名（参数类型... 变量名）{}
    可变参数的原理：
        可变参数底层就是一个数组，根据传递参数个数的不同，创建不同长度的数组来存储这些参数
    可变参数的注意事项：
        1.一个方法的参数列表，只能有一个可变参数
        2.如果方法的参数有多个，那么可变参数得必须写在参数末尾
*/
public class Test270VarArgs {
    public static void main(String[] args) {
        
        demo01(1,2,3);
    }
    // 计算数据的和
    private static void demo01(int...a) {
        System.out.println(a.getClass().getName()); // [I  [标识数组，I表示int类型
        int count=0;
        for (int i = 0; i <= a.length; i++) {
            count=count+i;
        }
        System.out.println(count);
    }
}

