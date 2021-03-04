package _09_dsa_list.practice;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Person> hashSet=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("Add name:");
            String name=sc.nextLine();
            System.out.println("Add age:");
            int age=Integer.parseInt(sc.nextLine());
            hashSet.add(new Person(age,name));
        }
        for (Person person: hashSet){
            System.out.println(person);
        }
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5);
        Set<Integer> integerSet=new HashSet<>(arrayList);
        System.out.println(integerSet);

    }
}
