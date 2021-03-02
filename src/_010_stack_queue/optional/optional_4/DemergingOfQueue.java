package _010_stack_queue.optional.optional_4;

import javax.print.attribute.standard.MediaSize;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DemergingOfQueue {
    public static Person[] demer(Person[] people){
        Queue<Person> NAM=new ArrayDeque<>();
        Queue<Person> NU=new ArrayDeque<>();
        for (int i=0;i<people.length;i++){
            if(people[i].getGender()=="nam"){
                NAM.add(people[i]);
            }else if(people[i].getGender()=="nu"){
                NU.add(people[i]);
            }
        }
        Person[] people1=new Person[people.length];
        int j=0;
        int k=NU.size();
        while (!NU.isEmpty()){
            people1[j]=NU.poll();
            j++;
        }

        while (!NAM.isEmpty()){
            people1[k]= NAM.poll();
            k++;
        }
        return people1;

    };
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number employee");
        int size=sc.nextInt();
        Person[] people=new Person[size];
        for (int i=0;i<people.length;i++){
            System.out.println("Enter name");
            String name=sc.nextLine();
            System.out.println("Enter gender(man/woman)");
            String gender=sc.nextLine();
            System.out.println("Enter birthday:(YY/MM/DD)");
            String birth=sc.nextLine();
            people[i]=new Person(name,gender,birth);
        }

        Arrays.sort(people);

        for (Person person:demer(people)){
            System.out.println(person);
        }
    }
}
