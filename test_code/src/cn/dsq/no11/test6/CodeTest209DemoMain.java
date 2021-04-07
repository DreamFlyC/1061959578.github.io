package cn.dsq.no11.test6;

public class CodeTest209DemoMain {
    public static void main(String[] args) {

        CodeTest209Hero hero = new CodeTest209Hero();

        hero.setName("剑圣");
        hero.setAge(19);

        CodeTest209Weapon weapon = new CodeTest209Weapon("多兰剑");
        hero.setWeapon(weapon);
        hero.attack();


        TestWeapon testWeapon = new TestWeapon("多兰剑子类");
        hero.setWeapon(testWeapon);
        hero.attack();

    }
}
