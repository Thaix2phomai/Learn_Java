package model;


public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private long basicSalary;

    public Employee(String name, int age, long basicSalary) {
        this.id = Util.generateId(5);
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract long calculatorSalary();

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary;
    }
}
