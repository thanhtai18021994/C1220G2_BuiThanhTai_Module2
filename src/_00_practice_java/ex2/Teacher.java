package _00_practice_java.ex2;

public class Teacher extends Person {
    private double salary;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}'+super.toString();
    }
}
