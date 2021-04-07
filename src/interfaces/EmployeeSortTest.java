package interfaces;

import java.util.Arrays;

/**
 *
 */
public class EmployeeSortTest
{
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("no1",35000);
        staff[1]=new Employee("no2",75000);
        staff[3]=new Employee("no3",38000);

        Arrays.sort(staff);

        //输出Employee类所有信息
        for(Employee a:staff)
            System.out.println("name="+a.getName()+",salary="+a.getSalary());
    }

}
