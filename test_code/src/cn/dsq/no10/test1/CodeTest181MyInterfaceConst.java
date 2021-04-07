package cn.dsq.no10.test1;


/*
接口当中也可以定义"成员变量“，但是必须使用public static final 三个关键字修饰
从效果上看，这其实就是接口的【常量】
格式：
publice static final 数据类型 常量名称 = 数据值；
备注： 一旦使用final关键字进行修饰，该变量就不能再改变了

注意事项：
1.接口当中的常量，可以省略 Public static final
2.接口当中的常量，必须进行赋值
3.（推荐命名) 接口当中的常量名称，使用完全大写的字符，用下划线进行分隔。
*/
public interface CodeTest181MyInterfaceConst {

    public  static  final int NUM =10;
}
