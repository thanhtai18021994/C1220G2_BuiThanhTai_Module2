package _00_practice_java.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhap so");
            int a=scanner.nextInt();
            throw new InputMismatchException("hello");
//            System.out.println(a);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
