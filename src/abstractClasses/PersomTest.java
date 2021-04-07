package abstractClasses;

public class PersomTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker",5000,1989,10,1);
        people[1] = new Student("Maria Morris","computer science");

        //print out name and descriptions of all Person objects
        for(Person p:people)  //for each循环输出数组，或者通过变量下标来输出
            System.out.println(p.getName()+","+p.getDescription());  //区别两个方法的不同
    }
}
