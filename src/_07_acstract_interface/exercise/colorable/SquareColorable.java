package _07_acstract_interface.exercise.colorable;

import _07_acstract_interface.exercise.resizeable.Square;

public class SquareColorable extends Square implements Colorable {
    public SquareColorable(double side) {
        super(side);
    }

    @Override
    public void howtocolor() {
        System.out.println("color for four side.");
    }

    public static void main(String[] args) {
        SquareColorable squareColorable=new SquareColorable(4.5);
        squareColorable.howtocolor();
    }
}
