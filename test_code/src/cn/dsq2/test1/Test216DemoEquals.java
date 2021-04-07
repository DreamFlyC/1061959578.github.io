package cn.dsq2.test1;

public class Test216DemoEquals {
    public static void main(String[] args) {
        Test215Person person1 = new Test215Person("张三",18);
        //person类默认集成了object类，所以可以直接使用Object的equals方法  boolean euqals(object obj)
        Test215Person person2 = new Test215Person("迪丽热巴",18);


        /*
        public boolean equals(Object obj) {
        return (this == obj);
           ==:比较运算符，基本数据类型比较的值。引用数据类型比较的是地址值
        */
        boolean b =person1.equals(person2);  //false
        System.out.println(b);




    }
}
