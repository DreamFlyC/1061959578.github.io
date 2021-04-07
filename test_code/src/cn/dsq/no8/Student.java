package cn.dsq.no8;

public class Student {
    private  int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0; //学号计数器



    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
//        idCounter=idCounter+1;
//        this.id = idCounter;
        this.id = ++idCounter;
    }

    public Student() {
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
