import java.util.Scanner;

public class ValueMaxArray {
    public static void main(String[] args) {
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang:");
        int n = sc.nextInt();
        System.out.println("Nhap so cot cua mang:");
        int m = sc.nextInt();
        arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Nhap phan tu hang "+(i+1)+"Cot"+(j+1)+":");
                arr[i][j]=sc.nextInt();
            }
        }
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]>max){
                   max=arr[i][j];
               }
            }
        }
        System.out.println("gia tri lon nhat :"+max);
    }
}
