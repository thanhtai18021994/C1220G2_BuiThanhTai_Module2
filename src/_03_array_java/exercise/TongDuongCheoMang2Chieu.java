import java.util.Scanner;

public class TongDuongCheoMang2Chieu {
    public static void main(String[] args) {
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang:");
        int n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu hang " + (i + 1) + "Cot" + (j + 1) + ":");
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    sum1 += arr[i][j];
                } else if (i == j) {
                    sum2 += arr[i][j];
                }
            }

        }
        System.out.println("Gia tri hang thu " + ":"+sum1);
        System.out.println("Gia tri hang thu " + ":"+sum2);
    }
}
