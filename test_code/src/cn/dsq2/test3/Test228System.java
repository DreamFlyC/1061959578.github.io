package cn.dsq2.test3;


import java.util.Arrays;

/*
    static long    currentTimeMillis():返回以毫秒为单位的当前时间。
    static void    arraycopy(Object src, int srcPos, Object dest, int destPos, int length):从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
        参数：
            src - 源数组。
            srcPos - 源数组中的起始位置。
            dest - 目标数组。
            destPos - 目标数据中的起始位置。
            length - 要复制的数组元素的数量。
        抛出：
            IndexOutOfBoundsException - 如果复制会导致对数组范围以外的数据的访问。
            ArrayStoreException - 如果因为类型不匹配而使得无法将 src 数组中的元素存储到 dest 数组中。
            NullPointerException - 如果 src 或 dest 为 null。
*/
public class Test228System {
    public static void main(String[] args) {
        // static long    currentTimeMillis()
        demo01();
        //static void    arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        demoo02();


    }

    private static void demoo02() {
        //练习：将src数组第2,3,4 个元素复制到desr数组的第3,4,5的位置上
//        src{1,2,3,4,5},dest{11,12,13,14,15}
        int[] src = {1,2,3,4,5};
        int[] dest = new int[5];
        dest =new int[]{11,12,13,14,15};
        System.arraycopy(src,1,dest,2,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
    }

    private static void demo01() {
        //输出for 循环打印1-99所需要的时间
        long st = System.currentTimeMillis();
        for (int i = 0; i < 99; i++) {
            System.out.println(i);

        }
        long ed=System.currentTimeMillis();
        System.out.println(ed-st);
    }
}
