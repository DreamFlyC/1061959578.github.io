package cn.dsq.no10.test6;

/*
向上转型一定是安全的，没有问题的。但是也有一个弊端：不能使用子类特有方法.

向下转型：还原
格式： 子类名称 对象名 = (子类名称）父类对象
含义：将父类对象还原成为本来的子类对象
*/
public class CodeTest190Main {
    public static void main(String[] args) {

        //对象的向上转型，就是：父类引用指向子类对象。
        CodeTest190Anmimal animal = new CodeTest190Cat();
        animal.eat();

//        CodeTest190Dog dog =(CodeTest190Dog) animal; //错误的向下转型会报错
        CodeTest190Cat cat = (CodeTest190Cat) animal;

        cat.catchMouse(); //可以使用子类特有方法了

        System.out.println(animal instanceof CodeTest190Cat);
        System.out.println(animal instanceof CodeTest190Dog);
    }

}
