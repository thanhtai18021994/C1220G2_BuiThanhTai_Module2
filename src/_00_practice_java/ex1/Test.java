package _00_practice_java.ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

        System.out.println(args[0]);
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            if(Integer.parseInt((String) iterator.next())%2==0){
                iterator.remove();
            }
        }
        System.out.println(arrayList.toString());
    }
}
