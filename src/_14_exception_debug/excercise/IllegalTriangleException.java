package _14_exception_debug.excercise;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
    public static void checkSide(double side1,double side2,double side3) throws IllegalTriangleException{
        try{
            if(side1<0||side2<0||side3<0){
                throw new IllegalTriangleException("side need >0!!!!");
            }
            if (side1 + side3 <= side2 || side1 + side2 <= side3 || side2 + side3 <= side1) {
                throw new IllegalTriangleException("Invalid side");
            }

        }catch (InputMismatchException e){
            throw new IllegalTriangleException("side is number");
        }
    }

    public static void main(String[] args) {
        try{
            Scanner scanner=new Scanner(System.in);
            double side1=scanner.nextDouble();
            double side2=scanner.nextDouble();
            double side3=scanner.nextDouble();
            checkSide(side1,side2,side3);
            System.out.println("succesful");
            System.out.println("side 1:"+side1 +"\n"+"side 2:"+side1 +"\n"+"side 3:"+side1 +"\n");
        }catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }
    }
}