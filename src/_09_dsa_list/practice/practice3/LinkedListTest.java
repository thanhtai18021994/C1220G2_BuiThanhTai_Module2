package _09_dsa_list.practice.practice3;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(7);
        linkedList.add(7);
        System.out.println(linkedList);
        for(int i=0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+"\t");
        }
        Set<Integer> hasSet=new HashSet<>(linkedList);
        System.out.println();
        System.out.println(hasSet);
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        ListIterator listIterator=linkedList.listIterator();
        System.out.println();


        System.out.println("duyet xuoi");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+"\t");
        }
        System.out.println();
        System.out.println("duyet nguoc");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous());
            System.out.print("a"+"\t");
        }

    }
}
