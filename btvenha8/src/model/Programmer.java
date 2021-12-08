package model;

import model.Employee;

public class Programmer extends Employee {
    private int overTime;

    public Programmer(String name, int age, String phoneNumber, String email, long basicSalary, int overTime) {
        super(name, age, phoneNumber, email, basicSalary);
        this.overTime = overTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public long salary (){
        return getBasicSalary() + overTime*200000;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Overtime: " + overTime + "h" + "\n" +
                "Salary: "  + salary() + " $" +"\n";
    }
}
