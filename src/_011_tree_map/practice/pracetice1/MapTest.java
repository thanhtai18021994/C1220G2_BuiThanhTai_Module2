package _011_tree_map.practice.pracetice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> hasMap=new HashMap<>();
        hasMap.put(1,"one");
        hasMap.put(0,"zero");
        hasMap.put(5,"five");
        hasMap.put(4,"four");
        Map<Integer,String> LinkedMap=new LinkedHashMap<>();
        LinkedMap.put(1,"one");
        LinkedMap.put(0,"zero");
        LinkedMap.put(5,"five");
        LinkedMap.put(4,"four");
        Map<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"one");
        treeMap.put(0,"zero");
        treeMap.put(5,"five");
        treeMap.put(4,"four");
        System.out.println("Element in hasMap");
        System.out.println(hasMap);
        System.out.println("Element in LinkedMap");
        System.out.println(LinkedMap);
        System.out.println("Element in treeMap");
        System.out.println(treeMap);
        treeMap.forEach((keyChar,valueInt)-> System.out.println("key="+keyChar+";"+"value ="+valueInt));
//        get key
        for(int key:treeMap.keySet()){
            System.out.println("key"+key);
        }
        for(String value:treeMap.values()){
            System.out.println("key"+value);
        }
    }
}
