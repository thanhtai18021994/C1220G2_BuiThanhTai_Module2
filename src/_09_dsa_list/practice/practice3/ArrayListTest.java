package _09_dsa_list.practice.practice3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
//        create arraylist
        ArrayList<String> arrayList=new ArrayList<>();
        for (int i=0;i<4;i++){
            arrayList.add("iterm:"+i);
        }
        for(String iterm:arrayList){
            System.out.print(iterm+"\t");
        }
        System.out.println();
//        create arraylist have 10 iterms
        ArrayList<String> arrayList1=new ArrayList<>(10);
        arrayList1.add("3");
        arrayList1.add("Ad");
        arrayList1.add("4");
        arrayList1.add("Ad");
        arrayList1.add(2,"location");
//        print iterms in array
        System.out.println(arrayList1);
//        print use loop for
        for(int i=0;i<arrayList1.size();i++){
            System.out.print(arrayList1.get(i)+"\t");
        }
        System.out.println();
        // use for each
        for(String iterm: arrayList1){
            System.out.print(iterm+"\t");
        }
        System.out.println();
        System.out.println("_________________________________________________");
//        use iterator
        Iterator<String> iterator =arrayList1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
        arrayList1.addAll(arrayList);
        System.out.print(arrayList1);

// get iterm
        System.out.println();
        System.out.println(arrayList1.get(3));
//        update iterm
        arrayList1.set(2,"a");
        System.out.println(arrayList1);
        //    delete element in arraylist
        System.out.println("before clear"+arrayList);
        arrayList.clear();
        System.out.println("after clear"+arrayList);
        System.out.println(arrayList1);
        arrayList1.remove(2);
        System.out.println(arrayList1);
        arrayList1.removeIf(iterm -> iterm == "Ad");
        System.out.println(arrayList1);
//        constain
        Boolean check=arrayList1.contains("4");
        System.out.println(check);
        System.out.println(arrayList1.indexOf("3"));
        Object[] arr=arrayList1.toArray();
        System.out.println(arr);
        for(Object iterm:arr){
            System.out.print(iterm+"\t");
            System.out.println(iterm instanceof String);
        }
        System.out.println(arr instanceof Object);

    }

}
