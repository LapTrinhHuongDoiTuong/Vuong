package bai2_sinhvien;
//import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
import java.util.*;

public class sinhvien {
  private String maSinhVien;
  private String ten;
  private String ngaySinh;
  private double diemTrungBinh;

  public sinhvien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
      this.maSinhVien = maSinhVien;
      this.ten = ten;
      this.ngaySinh = ngaySinh;
      this.diemTrungBinh = diemTrungBinh;
  }

  public void nhapThongTin() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nhap ma sinh vien: ");
      maSinhVien = scanner.nextLine();
      System.out.print("Ho va ten: ");
      ten = scanner.nextLine();
      System.out.print("Ngay sinh (dd/mm/yyyy): ");
      ngaySinh = scanner.nextLine();
      System.out.print("Diem trung binh: ");
      diemTrungBinh = scanner.nextDouble();
      scanner.nextLine();
  }

  public void inThongTin() {
      System.out.println("Ma sinh vien: " + maSinhVien);
      System.out.println("Ten: " + ten);
      System.out.println("Ngay sinh: " + ngaySinh);
      System.out.println("Diem trung binh: " + diemTrungBinh);
  }

  public double getDiemTrungBinh() {
      return diemTrungBinh;
  }
}

