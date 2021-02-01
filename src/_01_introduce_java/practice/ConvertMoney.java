import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        float USD;
        float k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap USD:");
        USD=sc.nextFloat();
        System.out.println("Nhap tile:");
        k=sc.nextFloat();
        float VND=USD*k;
        System.out.println(" Tien viet nam la:"+VND+"VND");

    }
}
