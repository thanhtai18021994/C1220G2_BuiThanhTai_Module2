package _18_string_regex.practice.practice3;

import _18_string_regex.practice.practice2.ValidateEmail;

import java.util.Scanner;

public class ValidateEmailTest {
    public static void main(String[] args) {
        System.out.println("Enter Acount:");
        Scanner scanner=new Scanner(System.in);
        String acount=scanner.nextLine();
        System.out.println("Acount"+acount+" is:"+ValidateAcount.validateEmail(acount));
    }
}
