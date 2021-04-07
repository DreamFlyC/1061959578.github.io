package cn.dsq2.test08;


import java.util.ArrayList;
import java.util.List;

/*
    try...catch : 捕获异常，并自己处理
    格式:
    try{
        可能产生异常的代码
    }
    catch(异常类名 变量名){}
    catch(异常类名 变量名){}

    注意：
    1.try中可能会产生多个异常
    2.可以存在多个catch

*/
/*
    finally注意事项：
        1.finally不能单独使用，需要和try一起使用
        2.finally一般用于资源释放（IO）
*/
public class Test294TryCatch {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("b");

        try {
            demo01(list,4 );
            System.out.println("资源释放1");    //不会输出
        } catch (Exception e) {
            /*
                Throwable处理异常的常用方法:
                     String	getMessage()：返回此 throwable 的简短描述。
                     String	toString()：返回此 throwable 的详细消息字符串
                      void	printStackTrace()：JVM打印异常对象，默认调用此方法
            */
//            e.printStackTrace();
            System.out.println(e.getMessage()); //自定义索引超出范围异常
            System.out.println(e.toString());   //java.lang.IndexOutOfBoundsException: 自定义索引超出范围异常

        }finally {
            System.out.println("资源释放2");    //会输出
        }
        System.out.println("后续代码"); //会继续输出
    }

    //只会抛出产生的异常
    private static void demo01(List<?> list, int i) throws Exception{
        //thorw的作用，可以对传递的参数进行合法性校验。
        if(i>list.size()-1){
            throw new IndexOutOfBoundsException("自定义索引超出范围异常");
        }else if(list == null){
            throw new NullPointerException("自定义空指针异常");
        }
        System.out.println(list.get(i));
    }
}
