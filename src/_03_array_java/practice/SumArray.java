import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang:");
        int n = sc.nextInt();
        System.out.println("Nhap so cot cua mang:");
        int m = sc.nextInt();
        arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu hang " + (i + 1) + "Cot" + (j + 1) + ":");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Gia tri hang thu " + (i + 1) + ":" + " " + sum);
        }
    }
}
