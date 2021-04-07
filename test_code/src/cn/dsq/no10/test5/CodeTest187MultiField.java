package cn.dsq.no10.test5;


/*
访问成员变量的两种方式

1.直接通过对象名称访问成员变量，看等号左边是谁，优先用谁，没有则向上招
2.间接通过成员方法访问,方法看右边，方法属于谁用谁。
*/
public class CodeTest187MultiField {
    public static void main(String[] args) {

        CodeTest187Fu obj = new CodeTest187Zi();

        System.out.println(obj.num);        //10
        System.out.println(obj.getNum());   //20
//        System.out.println(obj.age);      //错误引用
        System.out.println(obj.showNum());  //10
    }
}
