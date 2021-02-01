import java.util.Scanner;

public class FindMinNumber {
    public static int minNumber(int[] arr) {
        int min = arr[0];
        for (int number : arr) {

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] myArr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai mang:");
        int num = sc.nextInt();
        myArr = new int[num];
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("nhap phan tu mang:" + (i + 1));
            myArr[i] = sc.nextInt();
            System.out.println(myArr[i]);
        }
        System.out.println("Phan tu nho nhat trong mang la:" + minNumber(myArr));
    }
}
