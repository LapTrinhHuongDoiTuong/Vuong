package bai3;

import java.util.Scanner;

public class nganhang {
	private int sotaikhoan;
	private String tentaikhoan;
	private String matkhau;
	private int sodu;
	public nganhang(int sotaikhoan, String tentaikhoan, String matkhau, int sodu) {
		super();
		this.sotaikhoan = sotaikhoan;
		this.tentaikhoan = tentaikhoan;
		this.matkhau = matkhau;
		this.sodu = sodu;
	}
	public int getSotaikhoan() {
		return sotaikhoan;
	}
	
	public String getTentaikhoan() {
		return tentaikhoan;
	}
	
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public int getSodu() {
		return sodu;
	}
	public void setSodu(int sodu) {
		this.sodu = sodu;
	}
	public void nhap_so_tai_khoan() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so tai khoan");
		sotaikhoan =sc.nextInt();}
	public void nhap_ten_tai_khoan() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ten tai khoan");
		tentaikhoan = sc.nextLine();}
	public void nhap_mat_khau() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap mat khau");
		matkhau = sc.nextLine();
		}
	
	public void nhap_so_du() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so du");
		sodu = sc.nextInt();
		
	}
	public void nhaptiengui() {
		int tiengui;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap so tien ban muon gui ");
		tiengui= sc.nextInt();
		if (tiengui > 0) {
            sodu += tiengui;
            System.out.println("Bạn đã gửi thành công " + tiengui + ". Số dư hiện tại là: " + sodu);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
	}
	public void nhaptienrut() {
		int tienrut;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap so tien ban muon rut ");
		tienrut= sc.nextInt();
		if (tienrut > 0) {
            sodu -= tienrut;
            System.out.println("Bạn đã rút thành công " + tienrut + ". Số dư hiện tại là: " + sodu);
        } else {
            System.out.println("Số tiền gửi/rút phải lớn hơn 0.");
        }
	}
}
