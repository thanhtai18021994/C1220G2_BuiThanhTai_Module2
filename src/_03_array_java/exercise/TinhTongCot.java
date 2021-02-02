package _03_array_java.exercise;

import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr;
        System.out.println("Nhap so hang cua mang");
        int n=sc.nextInt();
        System.out.println("Nhap so cot cua mang");
        int m=sc.nextInt();
        arr= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Nhap phan tu vao mang:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Nhap so cot can tinh tong");
        int col=sc.nextInt();
        int sum=0;
        if(col<m&&col>=0){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(col==j){
                        sum+=arr[i][j];
                    }
                }
            }
            System.out.println("Tong cot thu "+col+"la: "+sum);
        }else {
            System.out.println("So cot nhap khong hop le");
        }
    }
}
