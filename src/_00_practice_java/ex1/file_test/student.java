package _00_practice_java.ex1.file_test;

public class student {
    private int age;
    private String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getInfor(){
        return name +"," + age;
    }
}
