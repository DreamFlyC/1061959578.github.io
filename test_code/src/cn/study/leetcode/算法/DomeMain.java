package cn.study.leetcode.算法;

import static cn.study.leetcode.算法.Test204.countPrimes;

public class DomeMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("countPrimes(499979) = " + countPrimes(999999999));
        long end = System.currentTimeMillis();
        System.out.println("countPrimes(499979)耗时: " + (double) (end - start) / 1000 + "s");
    }
}
