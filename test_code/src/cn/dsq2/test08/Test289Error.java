package cn.dsq2.test08;

public class Test289Error {
    public static void main(String[] args) {
        int[] arr = new int[1024*1024*1024];
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        //会出现错误
    }
}
