package abstractClasses;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hirday;

    public Employee(String name)
    {
        super(name);

    };

    public Employee(String name,double salary,int year,int month,int day) {
        super(name);
        this.salary=salary;
//        this.hirday = LocalDate.of(year,month,day);
        hirday = LocalDate.of(year,month,day);  //待解决，加this后有声明不同
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHirday() {
        return hirday;
    }

    public String getDescription()
    {
        return  String.format("an employee with a salary of $%.2f",salary);  //%.2f 浮点数。 需要复习xx
    }

    public void raiseSalary(double byPrecent)
    {
        double raise = salary * byPrecent/100;
        salary+=raise;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                "salary=" + salary +
                ", hirday=" + hirday +
                '}';
    }

    public static void main(String[] args) {
        Employee a =new Employee("test1");
        System.out.println(a.toString());
        String test1="字符串通过+链接对象测试"+a;
        System.out.println(test1);
    }
}
