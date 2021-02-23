package _07_acstract_interface.practice.comparator;

import _06_inheritance.practice.practice2.Circle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CircelTestComparator {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(3.5);
        circles[1]=new Circle(5.3);
        circles[2]=new Circle(3.1);
        Arrays.sort(circles,new CircleComparator());
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
