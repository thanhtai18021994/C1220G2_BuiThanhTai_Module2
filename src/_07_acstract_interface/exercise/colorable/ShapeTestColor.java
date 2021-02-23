package _07_acstract_interface.exercise.colorable;

import _06_inheritance.practice.practice2.Rectangle;
import _06_inheritance.practice.practice2.Shape;
import _07_acstract_interface.exercise.resizeable.CircleSize;
import _07_acstract_interface.exercise.resizeable.Square;

public class ShapeTestColor {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Rectangle(3,5);
        shapes[1]=new SquareColorable(4.5);
        shapes[2]=new CircleSize(4.7);
        for(Shape shape: shapes){
            System.out.println(shape.getArea());
            if(shape instanceof SquareColorable){
                SquareColorable squareColorable=(SquareColorable)shape;
                System.out.println("this is square : ");
                squareColorable.howtocolor();
            }
        }
    }
}
