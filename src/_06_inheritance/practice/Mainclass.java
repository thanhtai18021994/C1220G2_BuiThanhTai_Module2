package _06_inheritance.practice;

import _06_inheritance.practice.model.NhanVien;
import _06_inheritance.practice.model.NhanVienFulltime;
import _06_inheritance.practice.model.Nhanvienparttime;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap So Luong nhan vien:");
        int tongNhanVien=Integer.parseInt(sc.nextLine());
        NhanVien [] mangNhanVien=new NhanVien[tongNhanVien];
        for (int i=0;i<tongNhanVien;i++){
            System.out.print("Ten nhan vien thu"+(i+1)+" la:");
            String name=sc.nextLine();
            System.out.println("La nhan vien(1.toan thoi gian;2:Ban thoi gian");
            int lanhanvien=Integer.parseInt(sc.nextLine());
            if(lanhanvien==1){
                System.out.println("1:xep;2:Linh");
                int type=Integer.parseInt(sc.nextLine());
                System.out.println("Ngay lam them");
                int ngaylamthem=Integer.parseInt(sc.nextLine());
                mangNhanVien[i]= new NhanVienFulltime(name,ngaylamthem,type);
            }else {
                System.out.println("Gio lam:");
                int giolamthem=sc.nextInt();
                mangNhanVien[i]=new Nhanvienparttime(name,giolamthem);
            }
        }
    }
}
