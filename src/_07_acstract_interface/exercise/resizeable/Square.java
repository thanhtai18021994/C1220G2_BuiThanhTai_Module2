package _07_acstract_interface.exercise.resizeable;

import _06_inheritance.practice.practice2.Shape;

public class Square extends Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double areaSquare(){
        return side*side;
    }

    public double getArea() {
        return Math.pow(side,2);
    }
}
