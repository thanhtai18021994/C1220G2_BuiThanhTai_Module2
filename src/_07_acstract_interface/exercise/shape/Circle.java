package _07_acstract_interface.exercise.shape;

public class Circle extends Shape implements Resize {
    public double radius = 1.0;

    public Circle(String color) {
        super(color);
    }
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() * percent);
    }

    ;
}
