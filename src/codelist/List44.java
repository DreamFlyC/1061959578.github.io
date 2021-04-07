package codelist;

/**
 * @param  这个标记给当前方法的"parameters"(参数)部分添加一个条目。
 *
 */
public class List44 {
    public static void tripleValue(double x)
    {
        x = 3*x;
        System.out.println("End of method:x ="+ x);
    }

    public static void tripleSalary(Employee3 x)
    {
        x.raiseSalary(200);
        System.out.println("End of method:salary="+x.getSalary());
    }

    public static void  swap(Employee3 x,Employee3 y)
    {
        Employee3 temp =x;
        x=y;
        y=temp;
        System.out.println("End of method x="+x.getName());
        System.out.println("End of method y="+y.getName());
    }

     class Employee3
    {
        private String name;
        private double salary;

        public Employee3(String n,double s)
        {
            name = n;
            salary = s;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public void raiseSalary(double byPercent)
        {
            double raise = salary*byPercent/100;
            salary+=raise;
        }

        public void main(String[] args) {
            System.out.println("Resting tripeValue:");
            double precent = 10;
            System.out.println("Before:precent="+precent);
            tripleValue(precent);
            System.out.println("值传递后:precent="+precent);

            Employee3 harry =new Employee3("Harry",50000);
            System.out.println("一开始:salary=="+harry.getSalary());
            tripleSalary(harry);
            System.out.println("按引用传递后:salart="+harry.getSalary());

            System.out.println("java的引用传递也是按值传递");
            Employee3 a = new Employee3("allic",8000);
            Employee3 b = new Employee3("bbf",6000);
            System.out.println("a的名字是"+a.getName());
            System.out.println("b的名字是"+b.getName());
            swap(a,b);
            System.out.println("传递后a的名字"+a.getName());
            System.out.println("传递后b的名字"+b.getName());

        }
    }
}
