package _07_acstract_interface.practice.comparator;

import _06_inheritance.practice.practice2.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Circle c1= (Circle) o1;
        Circle c2= (Circle) o2;
        double result=c1.getRadius()-c2.getRadius();
        if(result>0){
            return 1;
        }else if(result<0){
            return -1;
        }else return 0;
    }
}
