package interfaces;

import java.security.PrivateKey;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byprecent){
        double raise = salary*byprecent/100;
        salary+=raise;
    }

    /**
     *  Compares employees by salary
     * @param o another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject,0 if the salaries are the same, a ppositive value otherwise
     */
    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
