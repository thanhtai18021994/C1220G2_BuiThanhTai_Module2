package _00_practice_java.treeset;

import _00_practice_java._00_comparator_comparable.compararator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeset<P> {
    public static void main(String[] args) {
        TreeSet<Person> treeSet=new TreeSet<>();
        List<Person> people=new ArrayList<>();
        people.add(new Person(45,"nam",345));
        people.add(new Person(45,"nam",345));
        people.add(new Person(45,"tan",345));
        for (int i=0;i<people.size();i++){
            treeSet.add(people.get(i));
        }
        System.out.println(treeSet);

    }
}
