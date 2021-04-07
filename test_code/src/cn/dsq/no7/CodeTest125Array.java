package cn.dsq.no7;


/*
* 概念：对象数组
* 定义一个数组，用来存储3个Person对象
*/
public class CodeTest125Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("aa",12);
        Person two = new Person("bb",18);
        array[2]= new Person("cc",20);

        array[0]=one;
        array[1]=two;

        Person person = array[1];
        System.out.println(array[1].getName());

    }
}
