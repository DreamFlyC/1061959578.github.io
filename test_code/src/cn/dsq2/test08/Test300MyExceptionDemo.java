package cn.dsq2.test08;

/*
    打印100以内所有素数
*/
public class Test300MyExceptionDemo {
    public static void main(String[] args) {
        String str = "abv";
        try {
            demo01(str);
        } catch (Test300MyException e) {
            e.printStackTrace();
        }

    }

    private static void demo01(String str) throws Test300MyException {
        if(str!="abc"){
            throw new Test300MyException("你输入的字符不是abc");
        }
    }
}


