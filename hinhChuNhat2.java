package tuan6_THLTHDT;
import java.util.Scanner;
public class hinhChuNhat2 {

	public static void main(String[] args) {
		hinhChuNhat1 hcn1=new hinhChuNhat1(0,0);
		hcn1.nhap();
		System.out.println("chu vi:"+hcn1.chuviHinhchunhat());
		System.out.println("dien tich:"+hcn1.dientichHinhchunhat());
	}

}
