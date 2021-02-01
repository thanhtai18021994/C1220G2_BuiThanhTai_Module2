import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int number;
        boolean check=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so can check:");
        number=sc.nextInt();
        if(number==2){
            System.out.println("day la so nguyen to.");
        }else if(number<2){
            System.out.println("day khong phai la so nguyen to");
        }else {
            for(int i=3;i<number;i++){
                if(number%i==0){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.println("Day la so nguyen to");
            }else {
                System.out.println("day khong phai la so nguyen to");
            }
        }
    }
}
