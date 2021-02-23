package _07_acstract_interface.exercise.resizeable;

import _06_inheritance.practice.practice2.Rectangle;
import _06_inheritance.practice.practice2.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new CircleSize(3.5);
        shapes[1] = new RectangleSize(4.5, 5.6);
        shapes[2] = new SquareSize(4);
        System.out.println("area before resize");
        for(Shape shape: shapes){
            System.out.println(shape.getArea());
        }
        System.out.println("after resize:");
        double percent = Math.random() * 100;
        System.out.println("percent"+percent);
        for (Shape shape : shapes) {
            if(shape instanceof CircleSize){
                CircleSize circleSize=(CircleSize)shape;
                circleSize.resize(percent);
                System.out.println(circleSize.getArea());
            }else if(shape instanceof RectangleSize){
                RectangleSize rectangleSize=(RectangleSize)shape;
                rectangleSize.resize(percent);
                System.out.println(rectangleSize.getArea());
            }else if(shape instanceof SquareSize){
                SquareSize squareSize=(SquareSize)shape;
                squareSize.resize(percent);
                System.out.println(squareSize.getArea());
            }
        }


    }
}
