package _00_practice_java._00_comparator_comparable.compararator;

import java.util.ArrayList;
import java.util.List;

public class Main {
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
        System.out.println("__________________________");
        people.sort((p1,p2)->{
            if(p1.getName().compareTo(p2.getName())<0){
                return -1;
            }else if(p1.getName().compareTo(p2.getName())>0){
                return 1;
            }else {
                if (p1.getAge()-p2.getAge()>0){
                    return 1;
                }else if (p1.getAge()-p2.getAge()<0){
                    return -1;
                }else {
                    if(p1.getId()-p2.getId()>0){
                        return 1;
                    }else if (p1.getId()-p2.getId()<0){
                        return -1;
                    }else {
                        return 0;
                    }
                }
            }
        });
        for (Person person:people){
            System.out.println(person);
        }
    }
}
