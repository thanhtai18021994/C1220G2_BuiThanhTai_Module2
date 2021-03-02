package _010_stack_queue.optional.optional_4;

import javax.xml.namespace.QName;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;
    private String gender;
    private String bird;

    public Person() {
    };

    public Person(String name, String gender, String bird) {
        this.name = name;
        this.gender = gender;
        this.bird = bird;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", bird='" + bird + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.bird.compareTo(o.getBird());
    }

    public static void main(String[] args) {
        Person[] people=new Person[2];

        people[0]= new Person("Tai", "Nam", "12/02/1994");
        people[1]= new Person("NAm", "Nam", "11/02/1994");
        for (Person person: people){
            System.out.println(person);
        }
        Arrays.sort(people);
        for (Person person: people){
            System.out.println(person);
        }


    }
}
