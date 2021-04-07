package codelist;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.org.apache.xpath.internal.objects.XNull;

import java.util.Random;

public class List45 {
//    本节展示
//    重载构造器；
//    用this(..)调用另一个构造器；
//    无参数构造器；
//    对象初始化块；
//    静态初始化块；
//    实例字段初始化;
public static void main(String[] args) {
    //fill the staff array with three Employee objects
    Employee4[] staff = new Employee4[3];

    staff[0]=new Employee4("Harry",40000);
    staff[1]=new Employee4(60000);
    staff[2]=new Employee4();

    //print out information about all Employee pbjects 输出Employe所有对象的信息
    for(Employee4 e:staff)
        System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
}


}

class Employee4
{
    private  static int nextId;

    private int id;
    private String name = "";  //instance field initialization 实例字段初始化
    private double salary;

    //static initialization block  静态块初始化
    static
    {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    //object initialization block 对象块初始化
    {
        id = nextId;
        nextId++;
    }

    // threee overloaded constructors 三个重载构造函数
    public Employee4(String n ,double s)
    {
        name = n;
        salary =s;
    }

    public Employee4(double s)
    {
        this("Employee #"+nextId,s);
    }

    // the default constructor 默认构造函数
    public Employee4()
    {
            //为空会初始化为默认值
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

 class Manager extends Employee4{
    public double getSalart()
    {
        double baseSalary = super.getSalary(); // super标识超类
        return baseSalary;
    }
}