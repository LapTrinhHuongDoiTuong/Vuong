package taikhoannganhang;

public class tai_Khoan_Tiet_Kiem extends taikhoan {
	private double laiSuat;
	private double tientietkiem=0;
    

    public tai_Khoan_Tiet_Kiem(String cCCD, String sDT, String soTaiKhoan, String hoTen, String matKhauTaiKhoan,
			int sodu, boolean isRegistered, double laiSuat, double tientietkiem) {
		super(cCCD, sDT, soTaiKhoan, hoTen, matKhauTaiKhoan, sodu, isRegistered);
		this.laiSuat = laiSuat;
		this.tientietkiem = tientietkiem;
	}

	public double getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(double laiSuat) {
		this.laiSuat = laiSuat;
	}

	public double getTientietkiem() {
		return tientietkiem;
	}

	public void setTientietkiem(double tientietkiem) {
		this.tientietkiem = tientietkiem;
	}

	public void tinhLai() {
        double lai = sodu * laiSuat / 100;
        System.out.println("Lãi suất hàng năm: " + lai);
        sodu-=lai;
        tientietkiem+=lai;
        System.out.println("tien tiet kiem:" + tientietkiem);
    }

}
