package _18_string_regex.excercise.excercise1;

import _18_string_regex.practice.practice3.ValidateAcount;

import java.net.PortUnreachableException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private final static String NAME_REGEX="[CPA][0-9]{4}[GHIKLM]$";
    public static Boolean validateName(String name){
        Pattern pattern=Pattern.compile(NAME_REGEX);
        Matcher matcher=pattern.matcher(name);
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println("Enter your NameClass");
        Scanner scanner=new Scanner(System.in);
        String nameClass=scanner.nextLine();
        System.out.println("Name class:" +nameClass+"is :"+ValidateNameClass.validateName(nameClass));
    }
}
