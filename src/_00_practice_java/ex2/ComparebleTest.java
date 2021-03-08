package _00_practice_java.ex2;

import java.util.List;

public class ComparebleTest implements Comparable<ComparebleTest> {
    int age;
    String name;

    public ComparebleTest(int age, String name) {
        this.age = age;
        this.name = name;
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
        return "ComparebleTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(ComparebleTest o) {
        return this.getAge()-o.getAge();
    }
}
