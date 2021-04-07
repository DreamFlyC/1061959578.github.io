package cn.dsq2.test11;


import java.io.File;

/*
java.io类 File
文件和目录路径名的抽象表示形式。主要用于文件和目录的创建、查找和删除等操作

核心点：
    file:文件
    directory:文件夹/目录
    path:路径

静态成员变量：
static String	pathSeparator：与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
static char	pathSeparatorChar：与系统有关的路径分隔符。
static String	separator：与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
static char	separatorChar：与系统有关的默认名称分隔符。

一个是路径分隔，一个是路径中不同文件的分隔.
了解绝对路径和相对路径

构造方法：
File(File parent, String child)：根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
File(String pathname)：通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
File(String parent, String child)：根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
File(URI uri)：通过将给定的 file: URI 转换为一个抽象路径名来创建一个新的 File 实例。

常用方法：
获取方法
 File	getAbsoluteFile()：返回此抽象路径名的绝对路径名形式。
 String	getPath()：将此抽象路径名转换为一个路径名字符串。
 String	getName()：返回由此抽象路径名表示的文件或目录的名称。
 long	length()：返回由此抽象路径名表示的文件的长度。
判断方法：
 boolean	exists()：测试此抽象路径名表示的文件或目录是否存在。
 boolean	isDirectory()：测试此抽象路径名表示的文件是否是一个目录。
 boolean	isFile()：测试此抽象路径名表示的文件是否是一个标准文件。

创建删除功能方法：
 boolean	createNewFile()：当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
 boolean	delete()：删除此抽象路径名表示的文件或目录。
 boolean	mkdir()：创建此抽象路径名指定的目录。
 boolean	mkdirs()：创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。

目录遍历方法：
 String[]	list(FilenameFilter filter)：返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 File[]	listFiles()：返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。


*/
public class Test344File {
    public static void main(String[] args) {
        String ps = File.pathSeparator;
        char ps2 = File.pathSeparatorChar;
        System.out.println(ps);  //>>>;
        System.out.println(ps2);    //>>>;

        String s =File.separator;
        char s2=File.separatorChar;
        System.out.println(s);  //>>>\
        System.out.println(s2); //>>>\


        System.out.println("File类的构造方法---------------");
        //File(File parent, String child)：根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        demo01();
        //File(String pathname)：通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        demo02();
        //File(String parent, String child)：根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        demo03();
        //File(URI uri)：通过将给定的 file: URI 转换为一个抽象路径名来创建一个新的 File 实例。
        //暂时放弃

        System.out.println("File类的路径获取方法---------------");
        //File	getAbsoluteFile()：返回此抽象路径名的绝对路径名形式。
        demo04();
        //String	getPath()：将此抽象路径名转换为一个路径名字符串。
        demo05();
        //String	getName()：返回由此抽象路径名表示的文件或目录的名称。该名称是路径名名称序列中的最后一个名称
        demo06();
        // long	length()：返回由此抽象路径名表示的文件的长度。此抽象路径名表示的文件的长度，以字节为单位；如果文件不存在，则返回 0L。
        demo07();

        System.out.println("File类的判断功能---------------");
        // boolean	exists()：测试此抽象路径名表示的文件或目录是否存在。 tip: 注意相对路径是相对哪里
        demo08();
        // boolean	isDirectory()：测试此抽象路径名表示的文件是否是一个目录。
        // boolean	isFile()：测试此抽象路径名表示的文件是否是一个标准文件。
        demo11();

        System.out.println("File类的新增/删除功能---------------");
        //mkdir()：创建此抽象路径名指定的目录。
//        demo9();
        //delete()：删除此抽象路径名表示的文件或目录。
//        demo10();
        // boolean	mkdirs()：创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。

        System.out.println("File类的遍历-------------------------");
        // String[]	list(FilenameFilter filter)：返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        // File[]	listFiles()：返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
        demo12();

    }

    private static void demo12() {
        File files = new File("F:\\code-tools\\code\\java-code\\JavaTest");
        String[] files1 = files.list();
        File[] files2 = files.listFiles();
        for (String s : files1) {
            System.out.println(s);
        }
        for (File file : files2) {
            System.out.println(file);
        }
        //tip 当目录不存在或者 为文件夹的时候进行遍历会报空指针异常

    }

    private static void demo11() {
        File file1 = new File("F:\\code-tools\\code\\java-code\\JavaTest\\test_code\\src\\cn\\dsq2");
        File file2 = new File("test_code");
        File file3 = new File("cccc");
        File file4 = new File("F:\\code-tools\\code\\java-code\\JavaTest\\JavaTest.iml");
        File file5 = new File("JavaTest.iml");
        File file6 = new File("JavaTest33.iml");
        System.out.println("正确绝对路径目录判断"+file1.isDirectory());
        System.out.println("正确相对路径判断"+ file2.isDirectory());
        System.out.println("用目录判断文件"+file4.isDirectory());
        System.out.println("不存在目录判断"+file3.isDirectory());
        System.out.println("正确绝对路径文件判断"+file4.isFile());
        System.out.println("正确相对路径文件判断"+file5.isFile());
        System.out.println("错误文件路径判断"+file6.isFile());
        System.out.println("文件方法判断目录"+file6.isDirectory());


    }

    private static void demo10() {
        File file1 = new File("F:\\code-tools\\code\\java-code\\JavaTest\\test_code\\src\\cn\\dsq2\\del1");
        File file2 = new File("del2");  //注意相对路径是相对什么位置
        boolean b1 = file1.delete();
        boolean b2 = file2.delete();
        System.out.println("删除文件夹1"+b1+",删除文件夹2"+b2);


    }

    private static void demo9() {
        File file1 = new File("F:\\code-tools\\code\\java-code\\JavaTest\\test_code\\src\\cn\\dsq2\\del1");
        File file2 = new File("del2");  //注意相对路径是相对什么位置
        boolean b1=file1.mkdir();
        boolean b2 = file2.mkdir();
        System.out.println("创建文件夹1"+b1+",创建文件夹2"+b2);
    }

    private static void demo08() {
        File file1 = new File("F:\\code-tools\\code\\java-code\\text3.text");
        System.out.println("错误绝对路径"+file1.exists());
        File file2 = new File("F:\\code-tools\\code\\java-code\\JavaTest\\test_code\\src\\cn\\dsq2\\test.java");
        System.out.println("正确绝对路径"+file2.exists());
        File file3 = new File("JavaTest.iml");
        System.out.println(file3.getAbsoluteFile());
        System.out.println("正确的相对路径"+file3.exists());
        File file4 = new File("test3");
        System.out.println("错误的相对路径"+file4.exists());
    }

    private static void demo07() {

        //此抽象路径名表示的文件的长度，以字节为单位；如果文件不存在，则返回 0L。
        File file = new File("F:\\code-tools\\code\\java-code\\text3.text");
        System.out.println(file.length());  //0

        File file2 = new File("F:\\code-tools\\code\\java-code\\JavaTest\\test_code\\src\\cn\\dsq2\\test11\\Test344File.java");
        System.out.println(file2.length()); //5458
    }

    private static void demo06() {
        File file = new File("F:\\code-tools\\code\\java-code\\text3.text");
        System.out.println(file.getName()); //>>>text3.text
        System.out.println(file.getName().getClass());
        //java.lang.String
    }

    private static void demo05() {
        File file = new File("F:\\code-tools\\code\\java-code\\text3.text");
        System.out.println(file.getPath()+file.getPath().getClass()); //>>>test3.text
        //java.lang.String
    }

    private static void demo04() {
        File file = new File("test3.text");
        System.out.println(file.getAbsoluteFile()+""+""+file.getAbsoluteFile().getClass()); //>>>F:\code-tools\code\java-code\JavaTest\test3.text
        //java.io.File
    }

    private static void demo03() {
        File file = new File("c:\\","test3.text");
        System.out.println(file);
    }

    private static void demo02() {
        File file = new File("c:\\test2.text");
        System.out.println(file);
    }

    private static void demo01() {
        File parent =new File("c:\\");
        String child = "test.txt";
        File file=new File(parent,child);
        System.out.println(file);

    }
}
