package cn.dsq2.test08;


/*
自定义异常类：
    格式
    public class xxxException extends Exception（或其子类）{
        添加一个参数构造
        添加一个带异常信息的构造方法
    }
    注意：
        1.自定义异常类一般都是以Exception结尾

*/
public class Test300MyException extends Exception{
    public Test300MyException() {
    }

    public Test300MyException(String message) {
        super(message);
    }
}
