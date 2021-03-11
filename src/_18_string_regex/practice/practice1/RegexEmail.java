package _18_string_regex.practice.practice1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEmail {
    public static void main(String[] args) {
        while (true) {
            Pattern p = Pattern.compile("^([a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(\\.(com|vn))+|(\\d+[a-z]\\s\\.com))$");
            System.out.println("Enter Email");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();
            if (p.matcher(email).find()) {
                System.out.println("email is ok");
                break;
            } else {
                System.out.println("Enter again");
            }
        }
    }
}
