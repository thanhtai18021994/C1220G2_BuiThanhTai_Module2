import java.util.Scanner;

public class AddElement {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Nhap chieu dai mang");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap Phan tu can chen:");
        num = sc.nextInt();
        System.out.println("Nhap vi tri can chen:");
        int k = sc.nextInt();
        if (k >= 0 && k < arr.length - 2) {
            for (int i = arr.length - 1; i > k; i--) {
                arr[i] = arr[i - 1];
            }
            arr[k] = num;
        }else if(k==arr.length-1){
          arr[k]=num;
        }else {
            System.out.println("khong thoa man");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("phan tu thu " + (i + 1) + ": " + arr[i]);
        }
    }

}
