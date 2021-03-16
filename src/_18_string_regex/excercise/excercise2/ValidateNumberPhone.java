package _18_string_regex.excercise.excercise2;

import _18_string_regex.excercise.excercise1.ValidateNameClass;

import java.net.PortUnreachableException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static final String PHONE_RGEX = "^\\([0-9]{2}\\)0[0-9]{9}$";

    public static boolean validatePhoen(String name) {
        Pattern pattern = Pattern.compile(PHONE_RGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Enter your phone");
        Scanner scanner=new Scanner(System.in);
        String phone=scanner.nextLine();
        System.out.println("Your phone:" +phone+"is"+ ValidateNumberPhone.validatePhoen(phone));
    }
}
