package cn.dsq2.test08;

/*
    运行期异常
*/
public class Test289RunException {
    public static void main(String[] args) {
        int[] arr = {1,2,3};


        try {
            //System.out.println(arr[3]); 的时候没有编译异常会出现运行异常
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);  //java.lang.ArrayIndexOutOfBoundsException: 3
        }
        System.out.println("后续代码");
    }
}
