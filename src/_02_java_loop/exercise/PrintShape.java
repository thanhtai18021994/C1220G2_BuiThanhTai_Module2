import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        System.out.println("1.Draw trianglebottom-left");
        System.out.println("2.Draw rectangle ");
        System.out.println("3.Draw triangle top-left");
        System.out.println("4.Draw isosceles triangle");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        int n = 5;
        switch (choose) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    System.out.println("* * * * *");
                }
                break;
            case 3:
                for (int i = 5; i > 0; i--) {
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 0; j <= 2 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    for (int j = 2 + i; j <= 5; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("");
                }
                break;

        }
    }
}
