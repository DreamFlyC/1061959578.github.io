package cn.dsq.no11.test07;



public class CodeTest210Hero {

    private String name;
    private CodeTest210Skill skill;

    public CodeTest210Hero() {
    }

    public CodeTest210Hero(String name, CodeTest210Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attact(){
        System.out.println("我叫"+name+"释放技能");
        skill.usr();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeTest210Skill getSkill() {
        return skill;
    }

    public void setSkill(CodeTest210Skill skill) {
        this.skill = skill;
    }
}
