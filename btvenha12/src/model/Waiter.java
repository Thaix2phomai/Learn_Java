package model;

import model.Employee;

public class Waiter extends Employee {
    private long compensate;

    public Waiter(String name, int age, long basicSalary, long compensate) {
        super(name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    @Override
    public long calculatorSalary() {
        return getCompensate() + getBasicSalary();
    }

    @Override
    public String toString() {
        return super.toString() + ", compensate=" + compensate + " $" + ", Salary=" + calculatorSalary() + " $";
    }
}
