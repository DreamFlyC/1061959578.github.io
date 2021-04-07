package cn.dsq.no11.test6;

public class CodeTest209Hero {

    private String name;    //英雄名称
    private int age;
    private CodeTest209Weapon weapon;

    public CodeTest209Hero() {
    }

    public CodeTest209Hero(String name, int age, CodeTest209Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("年龄为"+age+"的"+name+"用"+weapon.getCode()+"攻击敌方");
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

    public CodeTest209Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(CodeTest209Weapon weapon) {
        this.weapon = weapon;
    }
}
