package cn.dsq2.test11;


import java.io.File;
import java.io.FilenameFilter;

public class Test356Filter {
    public static void main(String[] args) {
        File file = new File("test_code\\src\\cn\\dsq");
        // 按文件名过滤
        demo01(file);
        System.out.println("方法2----------------------------");
        //
        demo02(file);
    }

    private static void demo02(File file) {
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println("------------------");
                System.out.println(dir);
                System.out.println("dir.getname:"+dir.getName());
                System.out.println("name:"+name);
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith("java");

            }
        });


        for (File file1 : files) {
            //递归 遍历目录
            if (file1.isDirectory()){
                demo02(file1);
            }else{
                System.out.println(file1);
            }
        }
    }

    private static void demo01(File file) {
        //按文件名过滤
        File[] files = file.listFiles(pathname ->{
            if(pathname.isDirectory()){
                return true;
            }
            return pathname.getName().toLowerCase().contains("85");
        });

        for (File file1 : files) {
            //递归 遍历目录
            if (file1.isDirectory()){
                demo01(file1);
            }else{
                System.out.println(file1);
            }
        }


    }

}
