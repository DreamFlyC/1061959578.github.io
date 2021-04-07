package cn.dsq2.test07;


import java.util.HashMap;
import java.util.Map;

/*
    HashMAp存储自定义类型键值：
    Map集合保证Key值唯一：必须重写HashCode方法和Equals方阿飞，以保证key值唯一
*/
public class Tested280HashMapSavePerson {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        HashMap<Tested280Person, String> map = new HashMap<>();
        map.put(new Tested280Person("张三",13),"湖南");
        map.put(new Tested280Person("李四",13),"湖南");
        map.put(new Tested280Person("张三",13),"湖北"); //由于张三重复了(通过HashCode和Equals判断），新的张三会替换原有数据
        for (Map.Entry<Tested280Person, String> st : map.entrySet()) {
            System.out.println(st.getKey()+"="+st.getValue());
        }
    }

}
/*
Tested280Person{name='张三', age=13}=湖北
Tested280Person{name='李四', age=13}=湖南
*/