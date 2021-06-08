package cn.dsq3.no2;

/**
 * @author 段市庆
 * @date 2021/5/11 22:25
 */

/*
    使用Lambda优化日志
    Lambda的特点：延迟加载
    Lambda的使用前提，必须存在函数式接口
*/
public class Test422LambdaLog {
    //定义一个显示日志的方法
    public static void  showLog(int level,Test422MsgBd mb){
        if(level ==1 ){
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用Showlog方法
        showLog(1,()->{
            //返回一个拼接发的字符串
            return msg1+msg2+msg3;
        });
        /*
            使用Lambda表达式作为参数传递，仅把参数传递到showLog方法中
            只有满足日志等级为1，才会调用Mb方法，进行字符串拼接
        */
        showLog(2,()->{
            //返回一个拼接发的字符串
            System.out.println("不满足条件，所以不会执行");
            return msg1+msg2+msg3;
        });
    }
}
