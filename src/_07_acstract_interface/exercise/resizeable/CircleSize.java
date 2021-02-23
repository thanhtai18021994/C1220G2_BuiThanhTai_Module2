package _07_acstract_interface.exercise.resizeable;
import _06_inheritance.practice.practice2.Circle;

public class CircleSize extends Circle implements Resizeable {
    public CircleSize() {
    }

    public CircleSize(double radius) {
        super(radius);
    }

    public CircleSize(double radius, boolean filled, String color) {
        super(radius, filled, color);
    }

    public void resize(double percent) {
        double newRadius = getRadius() * percent;
        setRadius(newRadius);
    }
}
