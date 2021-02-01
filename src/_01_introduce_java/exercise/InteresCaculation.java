import java.util.Scanner;

public class InteresCaculation {
    public static void main(String[] args) {
        long money;
        float laisuat;
        int sothanggui;
        int kyhangtinhlai;
        float interestMoney;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tien can gui:");
        money=sc.nextLong();
        System.out.println("Nhap so thang can gui");
        sothanggui=sc.nextInt();
        System.out.println("Lai suat ngan hang:");
        laisuat=sc.nextFloat();
        System.out.println("ky hang tinh lai");
        kyhangtinhlai=sc.nextInt();
        for(int i=1;i<=sothanggui/kyhangtinhlai;i++){
            money+=money*laisuat;
        }
        System.out.println("so tien sau n thang la:"+money);

    }
}
