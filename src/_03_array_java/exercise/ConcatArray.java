import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        System.out.println("Nhap chieu dai mang 1");
        int n1 = sc.nextInt();
        arr1 = new int[n1];
        System.out.println("Nhap chieu dai mang 2");
        int n2 = sc.nextInt();
        arr2 = new int[n2];
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length ; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            arr2[i] = sc.nextInt();
        }
        int[] myArr=new int[n1+n2];
        for(int i=0;i<arr1.length;i++){
            myArr[i]=arr1[i];
        }
        for(int i=arr1.length;i<myArr.length;i++){
            myArr[i]=arr2[i-arr1.length];
        }
        for(int i=0;i<myArr.length;i++){
            System.out.println(myArr[i]);
        }
    }
}
