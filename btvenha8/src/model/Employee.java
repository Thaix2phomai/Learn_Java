package model;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String phoneNumber ;
    private String email;
    private long basicSalary;

    public Employee(String name, int age, String phoneNumber, String email, long basicSalary) {
        this.id = Util.generateId(5);
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return  "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "age: " + age + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Email: " + email + "\n" +
                "Basic salary: " + basicSalary + " $" + "\n" ;
    }
}
