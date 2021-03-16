package _00_practice_java;

import java.util.Scanner;

public class testException {
    public static void main(String[] args) {
        System.out.println("enter number");
        while (true){
            Scanner scanner=new Scanner(System.in);
            int num=0;
            try {
                num=scanner.nextInt();
            }catch (Exception e){
//                System.out.println("Enter again");
            }
            if(num>0){
                System.out.println("success full");
                break;
            }else {
                System.out.println("enter agia 2");
            }
        }
    }
}
