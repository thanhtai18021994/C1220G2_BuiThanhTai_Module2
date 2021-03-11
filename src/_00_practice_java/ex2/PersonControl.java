package _00_practice_java.ex2;

import java.util.ArrayList;
import java.util.List;

public class PersonControl {
    public static void main(String[] args) throws Exception {
        Person person=new Person("Nam",12);
//        Person sudent=new Student("Nam",12,100);
        Person teacher=new Teacher("Nam",12,1000);
        List<Person> personList=new ArrayList<>();
        personList.add(person);
//        personList.add(sudent);
        personList.add(teacher);
        PersonManage personManage=new PersonManage(personList);
        for (Person person2:personManage.getPersonList()){
            System.out.println(person2);
        }
        System.out.println("__________________________");
        Person person1=new Person("Nam",12);
        Person person3=new Person("Nam",20);
        personManage.deletePerson(person3);
        for (Person person2:personManage.getPersonList()){
            System.out.println(person2);
        }
    }
}
