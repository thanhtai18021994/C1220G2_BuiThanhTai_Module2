package _06_inheritance.practice;

import _06_inheritance.practice.model2.Rectangle;
import org.w3c.dom.ls.LSOutput;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3.5,2.7);
        System.out.println(rectangle);
        rectangle=new Rectangle(3.5 ,2.7,"red",true);
        System.out.println(rectangle);
    }
}
