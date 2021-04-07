package cn.dsq2.test06;

import cn.dsq.no7.Person;

/*
       哈希值：是一个十进制的正数，由系统随机给出（可以理解为模拟出来的逻辑地址，不是数据实际存储的物理地址）
       在Object类中有一个方法，可以获取对象的hasg值
       int hashCode():返回对象的哈希值
*/
public class Test265HashCode {
    public static void main(String[] args) {
        Person a = new Person();
        System.out.println(a.hashCode());
        /*
            toString（）方法
             public String toString() {
                    return getClass().getName() + "@" + Integer.toHexString(hashCode());
                    //                    toHexString 转换为16进制
            }
        */
        System.out.println(a);


        /*
            String类的哈希值，
                String类重写了Object类的hashCode方法
        */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1.hashCode:"+s1.hashCode());
        System.out.println("S2.hashcode:"+s2.hashCode());
    }
}
/*
460141958
cn.dsq.no7.Person@1b6d3586
*/
