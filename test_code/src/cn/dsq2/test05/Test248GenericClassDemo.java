package cn.dsq2.test05;

public class Test248GenericClassDemo {
    public static void main(String[] args) {
        Test248GenericClass gc = new Test248GenericClass();
        gc.setName("只能是字符串");
        String name = gc.getName();
        System.out.println(name);
        //只能使用字符串狠不方便，所以使用泛型
        Test248GenericClass2<Integer> gc2 = new Test248GenericClass2<>();
        gc2.setName(123);
        System.out.println(gc2.getName());
    }
}
