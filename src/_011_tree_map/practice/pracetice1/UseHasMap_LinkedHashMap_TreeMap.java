package _011_tree_map.practice.pracetice1;

import java.util.*;
import java.util.TreeMap;

public class UseHasMap_LinkedHashMap_TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap=new HashMap<>();
        hashmap.put("Andrew",23);
        hashmap.put("Lide",22);
        hashmap.put("Kewn",25);
        hashmap.put("Kayn",30);
        Map<String,Integer> treemap=new TreeMap<>();
        treemap.put("Andrew",23);
        treemap.put("Lide",22);
        treemap.put("Kewn",25);
        treemap.put("Kaytreemap",40);
        Map<String,Integer> Linkedmap=new LinkedHashMap<>();
        Linkedmap.put("Andrew",23);
        Linkedmap.put("Lide",22);
        Linkedmap.put("Kewn",25);
        Linkedmap.put("Kaytreemap",40);
        System.out.println("this is hashmap");
        System.out.println(hashmap);
        System.out.println("this is linkedmap");
        System.out.println(Linkedmap);
        System.out.println("This is treemap");
        System.out.println(treemap);

    }

}
