package _06_inheritance.excercise.model_excercise1;

public class Circel {
    private double radius=1.0;
    private String color="red";

    public Circel() {

    }

    public Circel(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circel(double radius, String color, boolean filled) {
    }

    public Circel(double radius) {
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
     public double area(){
        return Math.pow(radius,2)*3.14;
     }

    @Override
    public String toString() {
        return "Circel{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
