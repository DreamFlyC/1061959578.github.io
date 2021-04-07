package test04;



import java.time.LocalDate;

public class Test42 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];


        staff[0] = new Employee("cc1",75000,1987,12,15);
        staff[1] = new Employee("cc2",50000,1989,10,1);
        staff[2] = new Employee("cc3",40000,1990,3,15);


        for(Employee e:staff)
            e.raiseSalary(5);

        for(Employee e:staff)
            System.out.println("name="+e.getName()+",salay="+e.getSalary()+",hireDay="+e.getHireDay());


    }


    static class Employee
    {
        private String name;
        private double salary;
        private LocalDate hireDay;
        private final StringBuilder evalution = new StringBuilder();


        public Employee(String n ,double s,int year,int month,int day)
        {
            name = n;
            salary =s;
            hireDay = LocalDate.of(year,month,day);
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        public void raiseSalary(double bypercent)
        {
            double raise =salary*bypercent/100;
            salary+=raise;
        }

    }


}
