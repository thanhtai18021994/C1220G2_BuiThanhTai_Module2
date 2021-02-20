package _06_inheritance.practice.model2;

public class Circle extends Shape {
    private double radius = 1.0;


    public Circle() {

    }

    public Circle(double radius) {

    }

    public Circle(double radius, boolean filled, String color) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "A circle with radius" + getRadius() + ",Which is a subclass of" + super.toString();
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle =new Circle(3.5);
        circle=new Circle(3.5,true,"blue");
        System.out.println(circle);
    }

}

