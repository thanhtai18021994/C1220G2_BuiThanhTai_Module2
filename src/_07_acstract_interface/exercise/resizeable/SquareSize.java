package _07_acstract_interface.exercise.resizeable;

public class SquareSize extends Square implements Resizeable {
    public SquareSize(double side) {
        super(side);
    }
    @Override
    public void resize(double percent) {
        setSide(getSide()*percent);
    }
}
