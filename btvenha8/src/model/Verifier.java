package model;

import model.Employee;

public class Verifier extends Employee {
    private int mistakeFound;

    public Verifier(String name, int age, String phoneNumber, String email, long basicSalary, int mistakeFound) {
        super(name, age, phoneNumber, email, basicSalary);
        this.mistakeFound = mistakeFound;
    }

    public int getMistakeFound() {
        return mistakeFound;
    }

    public void setMistakeFound(int mistakeFound) {
        this.mistakeFound = mistakeFound;
    }

    public long salary (){
        return getBasicSalary() + getMistakeFound()*50000;
    }
    @Override
    public String toString() {
        return super.toString() +
               "Mistake found: " + mistakeFound + "\n" +
               "Salary: " + salary() + " $" + "\n";
    }
}
