package _06_inheritance.excercise.model_excercise4;

import java.util.Scanner;

public class Triangle extends Shape2 {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double a=(side1+side2+side3)/2;
        return Math.sqrt(a*(a-side1)*(a-side2)*(a-side3));
    }
    public double getParimter(){
        return side1+side3+side2;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Area="+ getArea()+
                ", parimeter="+ getParimter()+
                '}';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap mau sac cua tam giac");
        String color=sc.nextLine();
        System.out.println("nhap canh 1:");
        double c1=sc.nextDouble();
        System.out.println("nhap canh 2:");
        double c2=sc.nextDouble();
        System.out.println("nhap canh 3:");
        double c3=sc.nextDouble();
        Triangle triangle=new Triangle(color,c1,c2,c3);
        System.out.println(triangle.toString());
    }
}
/*
 */