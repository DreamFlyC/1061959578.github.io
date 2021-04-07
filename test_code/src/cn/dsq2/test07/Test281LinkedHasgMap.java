package cn.dsq2.test07;


import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util类 LinkedHashMap<K,V>
    public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
    底层原理：哈希表+链表
*/
public class Test281LinkedHasgMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        LinkedHashMap<String, String> linkMap = new LinkedHashMap<>();
        linkMap.put("a","a");
        linkMap.put("c","c");
        linkMap.put("b","b");
        System.out.println(map);    //无序
        System.out.println(linkMap);    //有序

    }
}
/*
{a=a, b=b, c=c}
{a=a, c=c, b=b}
*/

