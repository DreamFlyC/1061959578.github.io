package cn.dsq2.test08;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/*
    java处理异常的五个关键字：try、catch、finally、throw、throws
    throw关键字：
        作用：可以使用throw关键字在指定的方法中抛出指定的异常
        使用格式： throw new xxxException("异常的原因")
     注意：
        1.throw关键字必须写在方法内部
        2.throw关键字后边new的对象为Exception类或其子类
        3.throw关键字抛出的是运行异常我们可以不处理，如果是编译异常我们需要通过代码处理该异常

*/
public class Test291Throw {
    public static void main(String[] args) {
        //定义一个列表，同数组所以来演示异常
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        demo01(list,4 );


    }

    //只会抛出产生的异常
    private static void demo01(List<?> list, int i) throws  IndexOutOfBoundsException,NullPointerException {
        //thorw的作用，可以对传递的参数进行合法性校验。
        if(i>list.size()-1){
            throw new IndexOutOfBoundsException("自定义索引超出范围异常");
        }else if(list == null){
            throw new NullPointerException("自定义空指针异常");
        }
        System.out.println(list.get(i));
    }
}
