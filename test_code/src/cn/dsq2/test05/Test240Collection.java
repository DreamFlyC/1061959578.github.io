package cn.dsq2.test05;


import java.util.ArrayList;
import java.util.Collection;

/*
    Colleciton常用方法：
         boolean	add(E e)： 向集合中添加元素。确保此 collection 包含指定的元素（可选操作）。
         boolean	remove(Object o):从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
         void	clear():移除此 collection 中的所有元素（可选操作）。
         boolean	contains(Object o):如果此 collection 包含指定的元素，则返回 true。
         boolean	isEmpty():如果此 collection 不包含元素，则返回 true。
         abstract  int	size():返回此 collection 中的元素数。
         Object[]	toArray():将集合转成一个数组，返回包含此 collection 中所有元素的数组。
*/
public class Test240Collection {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        //boolean	add(E e)：
        coll.add("hello");
        coll.add("world");
        System.out.println(coll);
        //boolean	remove(Object o):
        coll.remove("world");
        System.out.println(coll);
        //void	clear():
        coll.clear();
        System.out.println(coll);
        //boolean	contains(Object o):
        coll.add("hello");
        coll.add("world");
        boolean result = coll.contains("world");
        System.out.println(result);
        // boolean	isEmpty():
        System.out.println(coll.isEmpty());
        //abstract  int	size():
        System.out.println(coll.size());
        //Object[]	toArray():
        Object[] arr = coll.toArray();
        
        //遍历数组
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
            
        }
    }
}
