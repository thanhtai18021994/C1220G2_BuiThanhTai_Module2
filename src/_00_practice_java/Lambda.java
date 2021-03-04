package _00_practice_java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lambda implements Addable {
    public static void main(String[] args) {
        Addable addable=(int a,int b)->(a+b);
        System.out.println(addable.add(2,3));
        Addable addable1=(a,b)->(a+b);
        System.out.println(addable1.add(2,4));
        List<String> list= Arrays.asList("a","acv","bvcd");
        list.forEach(e-> System.out.println(e));
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }
}
