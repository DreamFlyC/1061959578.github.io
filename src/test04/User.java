package test04;


import java.util.StringJoiner;

//  按值传递和按引用传递的区别
public class User {
    private  String name;

    private  Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  String toString()
    {
        return new StringJoiner(",",User.class.getSimpleName()+"[","]")
                .add("name="+name+"")
                .add("age="+age)
                .toString();
    }

    public  static void 引用传递(User user){
        user.setName("康康");
        user.setAge(20);
    }

    public static void 值传递(String username){
        username="使用者";
    }

    String username2="cc";
    public void 引用传递2(){
        this.username2 = "vv";
    }


    public static void main(String[] args) {
        User user=new User();
        user.setName("张三");
        user.setAge(30);
        System.out.println(user); //输出user
        引用传递(user);   // 按引用传递，方法可以改变引用(user)的值
        System.out.println(user); //输出改变后的值
        System.out.println("-----------");
        String username = "王者";
        System.out.println(username);  //输出username
        值传递(username);  //值传递无法改变的值
        System.out.println(username); //输出username

        user.引用传递2();
        System.out.println(user.username2);

        //小结：按引用传递，列子中传递的时类User 的实例对象，它没有具体值。
    }
}
