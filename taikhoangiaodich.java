package nganhang_taikhoan;

import java.util.Scanner;

public class taikhoangiaodich  extends taikhoan implements thongtin{
	private String sotaikhoankhach;
	private String tennganhang;
	private double sotien;
	private double tiengoi;
	
	
	public taikhoangiaodich(String sotaikhoan, String tentaikhoan, String matkhau, String cccd, String sdt, double sodu,
			String sotaikhoankhach, String tennganhang, double sotien, double tiengoi) {
		super(sotaikhoan, tentaikhoan, matkhau, cccd, sdt, sodu);
		this.sotaikhoankhach = sotaikhoankhach;
		this.tennganhang = tennganhang;
		this.sotien = sotien;
		this.tiengoi = tiengoi;
	}
	
	public String getSotaikhoankhach() {
		return sotaikhoankhach;
	}
	public void setSotaikhoankhach(String sotaikhoankhach) {
		this.sotaikhoankhach = sotaikhoankhach;
	}
	public String getTennganhang() {
		return tennganhang;
	}
	public void setTennganhang(String tennganhang) {
		this.tennganhang = tennganhang;
	}
	
	
	public double getSotien() {
		return sotien;
	}
	public void setSotien(double sotien) {
		this.sotien = sotien;
	}
	
	public double getTiengoi() {
		return tiengoi;
	}
	public void setTiengoi(double tiengoi) {
		this.tiengoi = tiengoi;
	}
	@Override
	public void nhaptiengui() {
		System.out.println("Nhập số tiền gửi:");
		tiengoi= sc.nextDouble();
		if (tiengoi > 0) {
            sodu+= tiengoi;
           System.out.println("Bạn đã gửi thành công " + tiengoi + ". Số dư hiện tại là: " + sodu);
       } else {
           System.out.println("Số tiền gửi phải lớn hơn 0.");
       }
	}
	@Override
	public void nhaptienrut() {
	    Scanner sc = new Scanner(System.in);

	    // Nhập số tài khoản thụ hưởng
	    System.out.println("Nhập số tài khoản thu hưởng:");
	    sotaikhoankhach = sc.nextLine();

	    // Nhập ngân hàng thu hưởng
	    System.out.println("Nhập ngân hàng thu hưởng:");
	    tennganhang = sc.nextLine();

	    // Nhập số tiền muốn chuyển
	    System.out.println("Nhập số tiền bạn muốn chuyển:");
	    sotien = sc.nextDouble();

	    // Kiểm tra số tiền hợp lệ
	    if (sotien <= 0) {
	        System.out.println("Số tiền phải lớn hơn 0.");
	        return; // Kết thúc phương thức nếu số tiền không hợp lệ
	    }
	    
	       

	    // Kiểm tra điều kiện rút tiền
	    if (sotien <= sodu - 50000) { // Đảm bảo giữ lại 50,000 VND tối thiểu
	        sodu -= sotien;
	        System.out.printf("Chuyển tiền thành công! Số tiền còn lại: %.2f\n", sodu);
	    } else {
	        System.out.printf("Số tiền không đủ. Số dư hiện tại: %.2f\n", sodu);
	    }
	}

public void thongtintaikhoan() {
	System.out.println("sodu:"+sodu);
}
}