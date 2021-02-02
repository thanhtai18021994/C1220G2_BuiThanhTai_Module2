package _03_array_java.exercise;

import java.util.Date;
import java.util.Scanner;

public class CountLetter {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str=sc.nextLine();
        System.out.println("Nhap ki tu can kiem tra:");
        String letter=sc.nextLine();
        char x = letter.charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(x==str.charAt(i)){
                count++;
            }
        }
        System.out.println("So lan ki tu "+letter+"xuat hien la : "+count);
    }
}
