package model;

import model.Employee;

public class Kitchen extends Employee {
    private long serviceCharge;

    public Kitchen(String name, int age, long basicSalary, long serviceCharge) {
        super(name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        return getServiceCharge() + getBasicSalary();
    }

    @Override
    public String toString() {
        return super.toString() + ", serviceCharge=" + serviceCharge + " $" + ", Salary=" + calculatorSalary() + " $";

    }
}
