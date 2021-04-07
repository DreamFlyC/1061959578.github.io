package cn.dsq.no10.test4;


/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象
格式：
父类名称 对象名 = new 子类名称（）；
或者：
接口名称 对象名 = new 实现类名称();
*/
public class CodeTest186Multi {
    public static void main(String[] args) {
        //使用多态写法，左侧父类的引用，指向了右侧子类的对象
        Codetest186Fu obj = new CodeTest186Zi();

        obj.method();       //子类方法
        obj.methodFu();
    }
}
