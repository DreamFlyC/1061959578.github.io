package cn.dsq.no11.test07;

public class CodeTest210DemoMain {
    public static void main(String[] args) {

        CodeTest210Hero hero = new CodeTest210Hero();
        hero.setName("艾希");
            //通过实现类
        hero.setSkill(new CodeTest210SkillImpl());


            //通过匿名内对象 或者匿名内部类
        hero.setSkill(new CodeTest210Skill() {
            @Override
            public void usr() {
                System.out.println("技能-频A");
            }
        });
        hero.attact();
    }
}
