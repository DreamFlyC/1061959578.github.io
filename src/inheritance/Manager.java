package inheritance;

public class Manager extends Employee {
    private double bonus;
    /**
     * param  给当前参数添加一个描述
     * @param name the employ's name
     * @param  salary the salary
     * @param  year the hire year
     * @param  month the hire month
     * @param  day the hire day
     */
    public Manager(String name,double salary,int year,int month,int day)
    {
        super(name,salary,year,month,day);  //super 调用超类构造器,超类构造器参数需要一致
        bonus=0;
    }

    @Override
    public double getSalary() {
        double basesalary = super.getSalary(); //super 调用超类方法
        return basesalary+bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
