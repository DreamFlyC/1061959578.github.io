package cn.dsq2.test10;

import java.util.Arrays;

//练习
public class Test339LambdaDemo {
    public static void main(String[] args) {
        //无参数，无返回值的lambda表达式
        //Cook接口如果有多个方法的时候，使用lambda表达式会报错
        callCook(() -> {
            System.out.println("制作了面包");
        });

        System.out.println("------------------------");
        //lambda表达式:有参数有返回值练习
        Test340Person[] arr = {
                new Test340Person("一号", 18),
                new Test340Person("二号", 20),
                new Test340Person("三号", 19),
        };

        Arrays.sort(arr, (Test340Person t1, Test340Person t2) -> {
            return t1.getAge() - t2.getAge();
        });

        for (Test340Person test340Person : arr) {
            System.out.println(test340Person);

        }

        System.out.println("------------------------");
        //lambda表达式:有参数有返回值练习,简化lambda表达式
        SumNum(10, 20, (int a, int b) -> {
            return a + b;
        });


    }

    //定义一个方法调用Cook接口的方法
    public static void callCook(Test339Cook cook) {
        cook.makefood();
    }

    //定义一个方法调用SumNum接口的方法
    public static void SumNum(int a, int b, Test341SumNum sumNum) {
        int sum = sumNum.method1(a, b);
        System.out.println(sum);
    }
}
