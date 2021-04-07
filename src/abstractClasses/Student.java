package abstractClasses;

public class Student extends Person{
    private String major;

    /**
     * @param name the student's name
     * @param major
     */
    public Student(String name,String major)
    {
        //pass name to superclass constructor
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in"+major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public Student getthis(){
        return this;
    }

    public static void main(String[] args) {
       Student a =new Student("a","b");
       Student b =new Student("a","b");

        System.out.println(a.getthis());
        System.out.println(b.getthis());
        System.out.println(a);   // 方法里面的 this 就是指对象本身

    }
}
