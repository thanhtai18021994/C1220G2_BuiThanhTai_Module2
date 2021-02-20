package _06_inheritance.excercise.model_excercise1;

public class Cylinder extends Circel{
    private double height=1.0;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return height*area();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+super.toString();
    }

    public static void main(String[] args) {
        Circel cylynder=new Cylinder(3.2,"red",4.5);
        Cylinder cylinder2=new Cylinder(3.2,"red",4.5);
        System.out.println(cylinder2.volume());
        System.out.println(cylinder2.toString());
//        System.out.println(cylynder.toString());
    }

}

