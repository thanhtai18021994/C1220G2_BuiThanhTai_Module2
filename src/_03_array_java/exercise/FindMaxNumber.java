import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so phan tu mang muon co");
            n = sc.nextInt();
            if(n>20){
                System.out.println("so phan tu yeu cau be hon 20!!!!!");
            }
        } while (n > 20);
        int[] arr=new int[n];
        int i=0;
        while(i<arr.length){
            System.out.println("nhap phan tu thu: "+(i+1));
            arr[i]=sc.nextInt();
            i++;
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        int max=arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("so lon nhat la: "+ max);
    }
}
