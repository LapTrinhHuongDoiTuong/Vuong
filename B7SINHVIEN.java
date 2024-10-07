package tuan5THDT;
import java.util.Scanner;

public class B7SINHVIEN {
	private int masv;
	 private String ten;
	private double dtb;
	
	
	
	public B7SINHVIEN(int masv, String ten, double dtb) {
		
		this.masv = masv;
		this.ten = ten;
		this.dtb = dtb;
	}
	
	
	public int getMasv() {
		return masv;
	}


	public void setMasv(int masv) {
		this.masv = masv;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public double getDtb() {
		return dtb;
	}


	public void setDtb(double dtb) {
		this.dtb = dtb;
	}


@Override
public String toString() {
	return "MASV"+masv+"ten"+ten+"dtb"+dtb;
}
}
