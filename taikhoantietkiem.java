package nganhang_taikhoan;

import java.util.Calendar;
import java.util.Scanner;

public class taikhoantietkiem extends taikhoan implements thongtin{
	double tientietkiem;
	double laixuat=0.02;
	double tienlai;
	int thang;
	private int ngaygui;
	private int thanggui;
	private int namgui;
	
	public taikhoantietkiem(String sotaikhoan, String tentaikhoan, String matkhau, String cccd, String sdt, double sodu,
			double tientietkiem, double laixuat, double tienlai, int thang) {
		super(sotaikhoan, tentaikhoan, matkhau, cccd, sdt, sodu);
		this.tientietkiem = tientietkiem;
		this.laixuat = laixuat;
		this.tienlai = tienlai;
		this.thang = thang;
		

	}
	
	
	public double getTientietkiem() {
		return tientietkiem;
	}
	public void setTientietkiem(double tientietkiem) {
		this.tientietkiem = tientietkiem;
	}
	public double getLaixuat() {
		return laixuat;
	}
	public void setLaixuat(double laixuat) {
		this.laixuat = laixuat;
	}
	
	@Override
	 public void nhaptiengui() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap vao so tien ban muon goi:");
		tientietkiem=sc.nextDouble();
		System.out.println("nhap so thang ban muon goi:");
		thang=sc.nextInt();
		
		
		// Lưu ngày gửi
        Calendar calendar = Calendar.getInstance();
        ngaygui = calendar.get(Calendar.DAY_OF_MONTH);
        thanggui = calendar.get(Calendar.MONTH) + 1; // Tháng bắt đầu từ 0
        namgui = calendar.get(Calendar.YEAR);
        tienlai=(tientietkiem * Math.pow((1+laixuat), thang))-tientietkiem;
        System.out.println("Lãi suất hàng tháng là 0.02%/1 tháng");
        System.out.printf("Bạn đã gửi %.2f VNĐ vào ngày %d/%d/%d\n", tientietkiem, ngaygui, thanggui, namgui);
        System.out.printf("Ban sẽ nhan được  %f VNĐ nếu bạn gửi đủ thời gian", tienlai);
    }
		
	
	
	
	// Phương thức kiểm tra thời gian gửi
    public boolean kiemtraThoiGianRut(int ngayrut, int thangrut, int namrut) {
        // Tính số tháng đã gửi
        int soThangDaGui = (namrut - namgui) * 12 + (thangrut - thanggui);
        return soThangDaGui >= thang; // Kiểm tra xem đã đủ tháng chưa
    }
    
	@Override
	public void nhaptienrut() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày rút:");
        int ngayrut = sc.nextInt();
        System.out.println("Nhập tháng rút:");
        int thangrut = sc.nextInt();
        System.out.println("Nhập năm rút:");
        int namrut = sc.nextInt();
        
        if (kiemtraThoiGianRut(ngayrut, thangrut, namrut)) {
            // Đủ thời gian để rút tiền có lãi
            System.out.printf("Bạn có thể rút %.2f VNĐ với lãi suất.\n", sodu + tienlai);
        } else {
            System.out.println("Bạn chưa đủ thời gian. Nếu muốn rút tiền, bạn sẽ không có lãi.");
            System.out.println("Bạn có muốn rút tiền không có lãi? (true/false):");
            boolean choPhepRut = sc.nextBoolean();
            if (choPhepRut) {
                System.out.printf("Bạn đã rút %.2f VNĐ mà không có lãi.\n", sodu);
            } else {
                System.out.println("Bạn đã chọn không rút tiền.");
            }
        }
	}
public void thongtintaikhoan() {
	System.out.println("so tien hien co:"+tientietkiem);
	System.out.println("tien tiet kiem:"+tienlai);
}
	
	
}
