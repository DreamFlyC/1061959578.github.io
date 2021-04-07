package equals;

import java.util.Objects;

public class Manager extends Employee {

    private  double bouns;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    @Override
    public double getSalary() {
        double basesalary = super.getSalary();
        return basesalary+bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
//        return Double.compare(manager.bouns, bouns) == 0;
        return bouns == manager.bouns;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bouns);
    }

    @Override
    public String toString() {
        return super.toString() +
                "bouns=" + bouns +
                '}';
    }
}
