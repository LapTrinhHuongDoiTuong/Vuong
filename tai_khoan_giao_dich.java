package taikhoannganhang;
import java.util.Scanner;
public class tai_khoan_giao_dich extends taikhoan {
	private double phigiaodich;

	
	
	public tai_khoan_giao_dich(String cCCD, String sDT, String soTaiKhoan, String hoTen, String matKhauTaiKhoan,
			int sodu, boolean isRegistered, double phigiaodich) {
		super(cCCD, sDT, soTaiKhoan, hoTen, matKhauTaiKhoan, sodu, isRegistered);
		this.phigiaodich = phigiaodich;
	}


	public double getPhigiaodich() {
		return phigiaodich;
	}


	public void setPhigiaodich(double phigiaodich) {
		this.phigiaodich = phigiaodich;
	}


	public void tiengiaodich() {
        super.nhaptienrut();
        super.xacthucmatkhau();
        sodu -= phigiaodich;
        System.out.println("Phí giao dịch: " + phigiaodich);
        System.out.println("Số dư sau khi trừ phí: " + sodu);
        
        
    }
	
}
