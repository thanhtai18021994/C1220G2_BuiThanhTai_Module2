package _14_exception_debug.practice.practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCheckedExeption extends Exception{
    public AgeCheckedExeption(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "Lỗi nhập vào 1 tuổi"+super.getMessage();
    }
    public static int enterAgeStaff() throws AgeCheckedExeption{
        Scanner scanner=new Scanner(System.in);
        int age = 0;
        try {
            age=Integer.parseInt(scanner.nextLine());
            if(age<0){
                throw new AgeCheckedExeption("Invalid Age");
            }
        }catch (InputMismatchException e){
            throw new AgeCheckedExeption("age is number");
        }
        return age;
    }

    public static void main(String[] args)  {
        try{
            int age=enterAgeStaff();
            System.out.println("age í:"+ age);
        }catch (AgeCheckedExeption e){
            System.out.println(e.getMessage());
        }
    }
}
