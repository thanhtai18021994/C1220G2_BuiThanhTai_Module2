package _00_practice_java;

import java.time.LocalDate;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String string="KnOwN";
        string=string.toLowerCase();
        string=string.replace(string.substring(0,1),string.substring(0,1).toUpperCase());
        System.out.println(string);
        while (true){
            Scanner scanner=new Scanner(System.in);
            int age=0;
            try{
                age=scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Enter again");
            }
        }
        boolean check=2>4;
        System.out.println(check);
        System.out.println(LocalDate.now().getYear());

    }
}
