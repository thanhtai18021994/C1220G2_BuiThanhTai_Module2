package _00_practice_java.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        /*for(Integer iterm:integerList){
            if(iterm%2==0){
                integerList.remove(iterm);
            }
        }*/
        Iterator<Integer> iter=integerList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
            integerList.remove(1);
        }
        
        //System.out.println(integerList);
    }
}
