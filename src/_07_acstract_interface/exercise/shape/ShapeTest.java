package _07_acstract_interface.exercise.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[1];
        Circle circle=new Circle("red");
        shapes[0]=new Circle("red",3.5);
        circle.resize(30);
        System.out.println(circle.getRadius());
    }
}
