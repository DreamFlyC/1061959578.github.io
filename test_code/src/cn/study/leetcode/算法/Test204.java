package cn.study.leetcode.算法;

public class Test204 {


    public static int countPrimes(int n) {
        int count = 0;
        boolean[] flag=new boolean[n];
        for (int i = 2; i < n; i++) {
            //筛选为false的
            if(!flag[i]){
                count++;
                //从2开始， 不断筛选，进行标记
                for (int j = i+i; j < n; j+=i) {
                    flag[j]=true;
                }
            }

        }
        return count;
    }


}
