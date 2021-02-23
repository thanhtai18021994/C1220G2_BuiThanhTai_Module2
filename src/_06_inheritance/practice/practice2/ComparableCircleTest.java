package _06_inheritance.practice.practice2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles=new ComparableCircle[3];
        comparableCircles[0]=new ComparableCircle(3.6,true,"blue");
        comparableCircles[1]=new ComparableCircle();
        comparableCircles[2]=new ComparableCircle(3.5,false,"red");
        System.out.println("before sort");
        for(ComparableCircle circle : comparableCircles){
            System.out.println(circle);
        }
        Arrays.sort(comparableCircles);
        System.out.println("after Sort");
        for (ComparableCircle circle : comparableCircles){
            System.out.println(circle);
        }
    }
}
