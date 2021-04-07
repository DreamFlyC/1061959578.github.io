package cn.dsq2.test07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    java.util 接口 Map<K,V>
    Map集合的特点：
        1.双列集合，一个元素包含两个元素
        2.key 和 value 数据类型可以不同
        3.key不能重复，value能重复
        4.一个key 对应一个value
    Map接口常用实现类：HashMap、LinkedHashMap
    Map接口种的常用方法
         V	put(K key, V value)：将指定的值与此映射中的指定键关联（可选操作）。
         V	remove(Object key)：如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
         V	get(Object key)：返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
         boolean	containsKey(Object key)： 如果此映射包含指定键的映射关系，则返回 true。
         boolean	containsValue(Object value)：如果此映射将一个或多个键映射到指定值，则返回 true。
         Set<K>	keySet()：返回此映射中包含的键的 Set 视图。
         Set<Map.Entry<K,V>>	entrySet()：返回此映射中包含的映射关系的 Set 视图。
*/
public class Test274Map {
    public static void main(String[] args) {

        //V	put(K key, V value)：将指定的值与此映射中的指定键关联（可选操作）。
        demo01();
        //V	remove(Object key)：如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
        demo02();
        // V	get(Object key)：返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
        demo03();
        //boolean	containsKey(Object key)： 如果此映射包含指定键的映射关系，则返回 true。
        demo04();


        //Map集合的遍历第一种方法
        //Set<K>	keySet()：返回此映射中包含的键的 Set 视图。
        demo05();
        //Map集合的遍历第二种方法
        //Set<Map.Entry<K,V>>	entrySet()：返回此映射中包含的映射关系的 Set 视图。
        demo06();
    }

    private static void demo06() {
        /*
            取出Map集合的所有Entry对象，在通过Entry.getKey,Entry.getValue 遍历
        */
        Map<String,Integer> map=new HashMap<>();
        map.put("李晨",178);
        map.put("杨过",180);
        map.put("冰冰",160);
        for (Map.Entry<String, Integer> ss : map.entrySet()) {
            System.out.println(ss.getKey()+"="+ss.getValue());
//            杨过=180
//            李晨=178
//            冰冰=160
        }
    }

    private static void demo05() {
        /*
            Map集合的第一种遍历方法，取出所有的key到set集合，在利用key取出所有的value
        */
        Map<String,Integer> map=new HashMap<>();
        map.put("李晨",178);
        map.put("杨过",180);
        map.put("冰冰",160);
        Set<String> list =map.keySet();
        for (String o : list) {
            System.out.println(o+"="+map.get(o));
            /*
            杨过=180
            李晨=178
            冰冰=160
            */
        }
    }

    private static void demo04() {
        Map<String,Integer> map=new HashMap<>();
        map.put("李晨",178);
        map.put("杨过",180);
        map.put("冰冰",160);
        //判断集合是否含有key 和 value
        System.out.println(map.containsKey("冰冰"));      //true
        System.out.println(map.containsKey("超可爱"));     //false
        System.out.println(map.containsValue(160));        //true
        System.out.println(map.containsValue(210));         //false
    }

    private static void demo03() {
        Map<String,Integer> map=new HashMap<>();
        map.put("李晨",178);
        map.put("杨过",180);
        map.put("冰冰",160);
        map.put("冰冰",170);
        Integer i1 = map.get("冰冰");     //返回key对应的value值
        Integer i2 = map.get("超可爱");    //不存在Key值，则返回null
        System.out.println(map);    //{杨过=180, 李晨=178, 冰冰=170}
        System.out.println(i1);     //170
        System.out.println(i2);     //null
    }

    private static void demo02() {
        Map<String,Integer> map=new HashMap<>();
        map.put("李晨",178);
        map.put("杨过",180);
        map.put("冰冰",160);
        System.out.println(map);    //{杨过=180, 李晨=178, 冰冰=160}
        Integer i = map.remove("杨过"); //返回删除的值
        System.out.println(i);      //180
        System.out.println(map);    //{李晨=178, 冰冰=160}
        //tip:返回值为空的时候不能用Int接受否则会报错
        Integer i2 = map.remove("超可爱");
        System.out.println(i2);     //要删除的key值不存在的时候返回空值    null
        System.out.println(map);    //{李晨=178, 冰冰=160}


    }

    private static void demo01() {
        /*
            V	put(K key, V value)：将指定的值与此映射中的指定键关联（可选操作）。
            返回值V：
                存储键值对的时候,key不重复，返回值V是NULL；Key重复，会使用新的value替换map中的value值
        */

        Map<String,String> map=new HashMap<>();
        String v1 = map.put("李晨","范冰冰");
        System.out.println("v1:"+v1);
        String v2 = map.put("李晨","范冰冰2");
        System.out.println("v2:"+v2);
        System.out.println(map);
        /*
            运行结果：
            v1:null
            v2:范冰冰
            {李晨=范冰冰2}
        */
    }
}






