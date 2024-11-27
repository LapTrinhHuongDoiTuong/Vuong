package nganhang_taikhoan;

public class vay extends taikhoan implements thongtin , vaymuon{
	
	    private double sotienvay=0; // Số tiền vay
	    private double laisuat; // Lãi suất (dưới dạng thập phân, ví dụ 5% là 0.05)
	    private double thoigian; // Thời gian vay (tính bằng năm)
	    private double sotiendatra; // Số tiền đã trả
	    double tienlai;
	    double tientra;
	    // Constructor
	    
	    
	    public vay(String sotaikhoan, String tentaikhoan, String matkhau, String cccd, String sdt, double sodu,
				double sotienvay, double laisuat, double thoigian, double sotiendatra, double tienlai, double tientra) {
			super(sotaikhoan, tentaikhoan, matkhau, cccd, sdt, sodu);
			this.sotienvay = sotienvay;
			this.laisuat = laisuat;
			this.thoigian = thoigian;
			this.sotiendatra = sotiendatra;
			this.tienlai = tienlai;
			this.tientra = tientra;
		}
	    

	    public double getSotienvay() {
			return sotienvay;
		}

	    public void setSotienvay(double sotienvay) {
			this.sotienvay = sotienvay;
		}
	    public double getLaisuat() {
			return laisuat;
		}

		public void setLaisuat(double laisuat) {
			this.laisuat = laisuat;
		}

		public double getThoigian() {
			return thoigian;
		}

		public void setThoigian(double thoigian) {
			this.thoigian = thoigian;
		}

		public double getSotiendatra() {
			return sotiendatra;
		}

		public void setSotiendatra(double sotiendatra) {
			this.sotiendatra = sotiendatra;
		}

		public double getTienlai() {
			return tienlai;
		}

		public void setTienlai(double tienlai) {
			this.tienlai = tienlai;
		}

		public double getTientra() {
			return tientra;
		}

		public void setTientra(double tientra) {
			this.tientra = tientra;
		}

@Override
		// Phương thức mượn tiền
	    public void vay(double tientra) {
	    	System.out.println("nhạp số tiền cần vay:");
	    	tientra=sc.nextDouble();
	        sotienvay += tientra;
	        System.out.println("Đã mượn thêm: " + tientra);
	        System.out.println("");
	    }
	    
	@Override	
		// Phương thức tính lãi vay
	    public void tinhlai() {
	         tienlai= (float) (sotienvay * laisuat * thoigian);
	        System.out.println("tienlai:"+tienlai);
	    }
		@Override
	    // Phương thức trả nợ
	    public void trano(double tientra) {
	       
			if (tientra + sotiendatra > sotienvay + tienlai) {
	            System.out.println("Số tiền trả không hợp lệ. Bạn không thể trả nhiều hơn tổng số nợ.");
	        } else {
	            sotiendatra += tientra;
	            System.out.println("Đã trả nợ: " + tientra);
	        }
	    }

	  @Override  // Phương thức hiển thị thông tin vay
	    public void thongtintaikhoan() {
	        System.out.println("Thông tin vay:");
	        System.out.println("Số tiền vay: " + sotienvay);
	        System.out.println("Lãi suất: " + (laisuat * 100) + "%");
	        System.out.println("Thời gian vay: " + thoigian + " năm");
	        System.out.println("Lãi vay đơn: " + tienlai);
	        System.out.println("Số tiền đã trả: " + sotiendatra);
	        System.out.println("Số tiền còn nợ: " + (sotienvay + tienlai - sotiendatra));
	    }
}
	    
