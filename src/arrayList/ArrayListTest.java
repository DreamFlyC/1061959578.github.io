package arrayList;

import test04.Employee;

import java.util.ArrayList;

/**
 * this program demonstrates the ArrayList class
 * @version  1.11 2020-10-15
 * @author 段市庆
 */

public class ArrayListTest {
    public static void main(String[] args) {
        //fill the staff array list with three Employee objects
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker",75000,1987,12,15));
        staff.add(new Employee("Harrt Hacker",50000,1980,06,12));
        staff.add(new Employee("Tont Tester",40000,1990,3,15));

        //raise evertone's salart by 5%
        for(Employee e:staff)
            e.raiseSalary(5);

        //print out information about all Employee Obeject
        for (Employee e:staff)
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireDay());
    }
}
