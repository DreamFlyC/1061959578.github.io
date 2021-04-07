package test04;


//Test 4-3
public class StaticTest {
    public static void main(String[] args) {
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("tom",5000);
        staff[1] = new Employee2("dick",4500);
        staff[2] = new Employee2("kangkang",4000);

        for(Employee2 e:staff)
        {
            e.setId();  // 可以注释这一句后查看ID
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }

        int n =Employee2.getNextId();  //静态方法 不用实例化对象， 也就是说不用在新增一个员工就可以得出下一个员工的ID，节省内存
        System.out.println("next available id ="+n);

    }
}

class Employee2
{
    private static  int nextId = 1;


    private String name;
    private double salary;
    private  int id;


    private  int cc =assingnId();
//    private int dd ;
//    dd = assingnId();   //会报错，暂时不清楚原因

    public  int assingnId()
    {
        int r = nextId;
        nextId++;
        return  r;
    }

    public  Employee2(String n,double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public  String getName()
    {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId()
    {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee2 e = new Employee2("kangkang",60000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}