package _08_cleancode_refactoring.practice;

public class SpilitVariable {
    public static String fizzBuzz(int number){
         boolean isFizz=number%3==0;
         boolean isBuzz=number%5==0;
         if(isBuzz&&isFizz){
             return "fizzBuzz";
         }else if(isBuzz) return "Buzz";
         else if(isFizz) return "fizz";
         else return number+"";
    }

}
