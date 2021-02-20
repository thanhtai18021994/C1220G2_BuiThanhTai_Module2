package _05_access_modifier_static.exercise;

public class Circle {
    private double radius=1.0;
    private static String color="Red";
    Circle(){

    }
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public static void change(){
        color="blue";
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle.change();
        Circle circle1=new Circle();
        Circle circle2=new Circle();
        System.out.println(circle1.getColor());
        System.out.println(circle2.getColor());
    }

}
