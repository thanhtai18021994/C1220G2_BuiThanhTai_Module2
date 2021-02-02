package _04_java_object.practice;

import java.util.Date;
import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    public   Rectangle(){};
    public Rectangle(double newWidth,double newHeight){
        this.width=newWidth;
        this.height=newHeight;
    }
    public double getArea(){
        return width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String dispaly(){
        return "rectangle{"+"Width="+width+"height="+height+"}";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu rong hinh chu nhat:");
        double width=sc.nextDouble();
        System.out.println("Nhap chieu dai hinh chu nhat");
        double height=sc.nextDouble();
        Rectangle myRec=new Rectangle(width,height);
        System.out.println("Thong tin hinh chu nhat: "+myRec.dispaly());
        System.out.println("Dien tich hinh chu nhat: "+myRec.getArea());
        System.out.println("Chu vi hinh chu nhat: "+myRec.getPerimeter());
    }

}

