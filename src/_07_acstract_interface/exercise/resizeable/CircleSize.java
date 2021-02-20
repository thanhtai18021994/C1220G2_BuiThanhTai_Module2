package _07_acstract_interface.exercise.resizeable;

import _06_inheritance.excercise.model_excercise1.Circel;

public class CircleSize extends Circel implements Resizeable {
    public CircleSize() {
    }

    public CircleSize(double radius, String color) {
        super(radius, color);
    }

    public CircleSize(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public CircleSize(double radius) {
        super(radius);
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() * percent);
    }
}
