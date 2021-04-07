package equals;


import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hiredate;

    public Employee(String name,double salary,int year,int month,int day){
        this.name=name;
        this.salary=salary;
        hiredate =LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void raiseSalary(double byprecent){
        double raise = salary*byprecent/100;
        salary+=raise;
    }

    @Override
    public boolean equals(Object otherobject) {
        //a quick test to see if the object are identical
        if (this == otherobject) return true;

        //must return false if the explicit parameter is nul
        //if the classes don't match ,they can't be equal
        if (otherobject == null || getClass() != otherobject.getClass()) return false;
        Employee employee = (Employee) otherobject;
        //test whether the fields have identical values
        return salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                Objects.equals(hiredate, employee.hiredate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hiredate);
    }

    @Override
    public String toString() {
        return getClass().getName()+
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }
}
