package _00_practice_java;

import _00_practice_java._00_comparator_comparable.TestStatic;
import _00_practice_java._00_comparator_comparable.compararator.Person;

public class TestOverRide extends Person {
private int salary;
    public TestOverRide(int id, String name, int age) {
        super(id, name, age);
    }

    public TestOverRide(int id, String name, int age, int salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String showInfor(){
        return getId()+","+getName()+","+getAge()+","+getSalary();
    }

    public static void main(String[] args) {
        Person testStatic=new TestOverRide(34,"tai",34,4000);
        Person person=new Person(56,"Hai",45);
        System.out.println(testStatic.showInfor());
        System.out.println(person.showInfor());
    }
}
