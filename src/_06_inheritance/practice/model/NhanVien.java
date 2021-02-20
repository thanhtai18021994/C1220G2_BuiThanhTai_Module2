package _06_inheritance.practice.model;

import java.util.Scanner;

public class NhanVien {
    protected String name;
    protected int luong;

    public NhanVien() {

    }

    public NhanVien(String name) {

    }

    protected String loaiNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lai nhan vien");
        String loainhanvien;
        loainhanvien = sc.nextLine();
        return loainhanvien;
    }

    public void tinhluong() {

    }

    public void xuatThongTin() {

    }
}
