package _07_acstract_interface.exercise.resizeable;

import _06_inheritance.practice.practice2.Rectangle;

public class RectangleSize extends Rectangle implements Resizeable {
    public RectangleSize() {
    }

    public RectangleSize(double width, double length) {
        super(width, length);
    }

    public RectangleSize(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void resize(double percent){
        setLength(getLength()*percent);
        setWidth(getWidth()*percent);
    }
}
