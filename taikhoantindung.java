package nganhang_taikhoan;

public class taikhoantindung extends taikhoan implements vaymuon{
	private double hanmuctindung=10000000;
	private double laixuat;
	private double tientra;
	private double tongtiendavay;
	private long thoigianbatdau;
	
	public taikhoantindung(String sotaikhoan, String tentaikhoan, String matkhau, String cccd, String sdt, double sodu,
			double hanmuctindung, double laixuat, double tientra, double tongtiendavay, long thoigianbatdau) {
		super(sotaikhoan, tentaikhoan, matkhau, cccd, sdt, sodu);
		this.hanmuctindung = hanmuctindung;
		this.laixuat = laixuat;
		this.tientra = tientra;
		this.tongtiendavay = tongtiendavay;
		this.thoigianbatdau = thoigianbatdau;
	}
	public double getHanmuctindung() {
		return hanmuctindung;
	}
	public void setHanmuctindung(double hanmuctindung) {
		this.hanmuctindung = hanmuctindung;
	}
	public double getLaixuat() {
		return laixuat;
	}
	public void setLaixuat(double laixuat) {
		this.laixuat = laixuat;
	}
	
	
	public double getTientra() {
		return tientra;
	}
	public void setTientra(double tientra) {
		this.tientra = tientra;
	}
	@Override
	public void vay(double tientra) {
		System.out.println("Hạn mức của bạn hiện là 10.000.000 _ mười triệu chẵn ");
		System.out.println("nhap vao so tien can tra:");
		tientra=sc.nextDouble();
		
		if(tientra <= hanmuctindung-sodu)
		{
			sodu += tientra;
			tongtiendavay += tientra;
	        thoigianbatdau = System.currentTimeMillis();
            System.out.println("Giao dịch thành công! Số tiền đã chi tiêu: "+tientra);
        } else {
            System.out.println("Giao dịch không thành công! Vượt quá hạn mức tín dụng.");
        }

		}
	@Override
	public void nhaptienrut() {
		if (tientra <= sodu) {
            sodu -= tientra;
            System.out.println("Thanh toán thành công! Số tiền đã thanh toán:"+tientra);
        } else {
            System.out.println("Số tiền thanh toán không hợp lệ.");
        }
	}
	@Override
	public void tinhlai() {
		if (tongtiendavay > 0) {
            long soNgayDaVay = (System.currentTimeMillis() - thoigianbatdau) / (1000 * 60 * 60 * 24); // Tính số ngày đã vay
            double laiPhaiTra = tongtiendavay * laixuat / 100 * (soNgayDaVay / 365.0);
            System.out.printf("Lãi suất phải trả cho số dư: %.2f\n", laiPhaiTra);
        } else {
            System.out.println("Không có số dư để tính lãi suất.");
        }
		
	}
	@Override
	public void trano(double tientra) {
		if (tientra <= sodu) {
            sodu -= tientra;
            System.out.printf("Trả nợ thành công! Số tiền đã trả: %.2f\n", tientra);
        } else {
            System.out.println("Số tiền trả nợ không hợp lệ.");
        }
	}
	}

