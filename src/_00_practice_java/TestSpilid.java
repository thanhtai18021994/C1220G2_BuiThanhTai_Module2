package _00_practice_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSpilid {
    public static void main(String[] args) {
    String[] arr={"add","dds"};
        List<String[]> list=new ArrayList<>();
        list.add(arr);
        for (String[] strings:list){
            System.out.println(Arrays.toString(strings));
        }
    }
}
