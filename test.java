package bai2_sinhvien;
import java.util.*;
public class test {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<sinhvien> danhSach = new ArrayList<>();
	        System.out.print("Nhap so luong sinh vien: ");
	        int soLuong = scanner.nextInt();
	        scanner.nextLine();
	        for (int i = 0; i < soLuong; i++) {
	            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
	            sinhvien sv = new sinhvien("", "", "", 0);
	            sv.nhapThongTin();
	            danhSach.add(sv);
	        }
	        danhSach.sort((sv1, sv2) -> Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh()));
	        System.out.println("\nDanh sach sinh vien sau khi sap xem theo diem trung binh giam dan:");
	        for (sinhvien sv : danhSach) {
	            sv.inThongTin();
	            System.out.println();
	        }
	    
	}

}
