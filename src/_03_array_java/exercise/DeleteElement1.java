import java.util.Scanner;
public class DeleteElement1 {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai mang");
        int num = sc.nextInt();
        arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap phan tu thu n:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap phan tu can xoa:");
        int k = sc.nextInt();
        int c=0;
        for (int i = 0; i < num; i++) {
            if (arr[i] != k) {
                arr[c] = arr[i];
                c++;
            }
        }
        int[]Myarr=new int[c];
        System.arraycopy(arr,0,Myarr,0,Myarr.length);
        for(int number:Myarr){
            System.out.println(number);
        }
    }
}
