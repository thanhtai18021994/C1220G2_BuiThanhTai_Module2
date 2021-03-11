package _15_io_file.practice.practice2;

public class Staff {
    private static int id=1;
    private int id1;
    private String name;
    private int age;
    private double salary;

    public Staff() {
    }

    public Staff(String name, int age, double salary) {
        this.id1 = id++;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id1=" + id1 +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public String showInfor(){
        return getId1()+","+getName()+","+getAge()+","+getSalary();
    }

}
