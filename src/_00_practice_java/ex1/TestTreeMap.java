package _00_practice_java.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Product product1=new Product(1,"salt",2345);
        Product product11=new Product(1,"salt",2345);
        Product product2=new Product(4,"salt",2345);
        Product product3=new Product(5,"salt",2345);
        System.out.println(product1.equals(product11));
        Map<Product,Integer> productIntegerMap=new TreeMap<>();
        productIntegerMap.put(product1,3);
        productIntegerMap.put(product2,2);
        productIntegerMap.put(product3,6);
        productIntegerMap.forEach((a,e)-> System.out.println(a.toString()+"\t"+"Số lượng la:"+e));
    }
}
