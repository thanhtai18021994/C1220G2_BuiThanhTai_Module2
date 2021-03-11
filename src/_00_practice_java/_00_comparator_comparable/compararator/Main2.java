package _00_practice_java._00_comparator_comparable.compararator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person(23,"Tai",45));
        people.add(new Person(22,"Nguyen",245));
        people.add(new Person(45,"Hua",430));
        people.add(new Person(46,"Hua",430));
        people.add(new Person(89,"Tuan",10));
        for(Person person:people){
            System.out.println(person);
        }
        System.out.println("----------after----------");
        Collections.sort(people,new SortID());

        for(Person person:people){
            System.out.println(person);
        }
        System.out.println("------------after------------");
        Collections.sort(people,new SortName());
        for(Person person:people){
            System.out.println(person);
        }
    }
}
