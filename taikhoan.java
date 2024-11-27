package nganhang_taikhoan;

import java.util.Scanner;

public abstract class taikhoan implements thongtin{
	protected String sotaikhoan;
	protected String tentaikhoan;
	private String matkhau;
	private String cccd;
	private String sdt;
	double sodu;
	private boolean isRegistered = false;
	Scanner sc= new Scanner(System.in);
	
	public taikhoan(String sotaikhoan, String tentaikhoan, String matkhau, String cccd, String sdt, double sodu) {
		
		this.sotaikhoan = sotaikhoan;
		this.tentaikhoan = tentaikhoan;
		this.matkhau = (matkhau != null && !matkhau.isEmpty()) ? matkhau : "default_password";
		this.cccd = cccd;
		this.sdt = sdt;
		this.sodu = sodu;
	}
	
	public String getSotaikhoan() {
		return sotaikhoan;
	}
	public String getTentaikhoan() {
		return tentaikhoan;
	}
	public double getSodu() {
		return sodu;
	}
	public void setSotaikhoan(String sotaikhoan) {
		this.sotaikhoan = sotaikhoan;
	}
	public void setTentaikhoan(String tentaikhoan) {
		this.tentaikhoan = tentaikhoan;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public void setSodu(double sodu) {
		this.sodu = sodu;
	}
	
	
	
	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	public String getMatkhau() {
		return matkhau;
	}

	public void dangky() {
		System.out.println("nhap ho ten ban:");
		 tentaikhoan= sc.nextLine();
		
		System.out.println("nhap sdt cua ban:");
		 sdt=sc. nextLine();
		
		System.out.println("Can Cuoc Cong Dan Cua Ban:");
		 cccd=sc.nextLine();
		
		System.out.print("Nhập số tài khoản: ");
        sotaikhoan = sc.nextLine();
       
       System.out.print("Nhập mật khẩu: ");
        matkhau = sc.nextLine();	
       
		if(sdt.length()>11 && sdt.length() <10) {
			System.out.println("sdt khong dung!!!!!");
			return;
		}
		if(cccd.length()!=12) {
			System.out.println("cccd cua ban khong dung");
			return;
		}
		 isRegistered = true; 
		System.out.println("tao tai khoan thanh cong !!!!!");
		
	}
	
	public void dangnhap() {
		if (!isRegistered) { // Kiểm tra nếu tài khoản chưa đăng ký
            System.out.println("Bạn chưa có tài khoản. Vui lòng đăng ký trước!");
            dangky(); // Gọi phương thức đăng ký
            return; // Kết thúc phương thức sau khi đăng ký
        }
		int sai=0;
	
		Scanner sc = new Scanner(System.in);
	while(sai<3) {
        System.out.print("Nhập số tài khoản: ");
        String soDangNhap = sc.nextLine();
        
        System.out.print("Nhập mật khẩu: ");
        String matKhauNhap = sc.nextLine();
        
        

        if (soDangNhap.equals(sotaikhoan) && matKhauNhap.equals(matkhau)) {
            System.out.println("Đăng nhập thành công!");
            return ;
        } else {
            System.out.println("Tên tài khoản hoặc mật khẩu không chính xác.");
            sai++;
            
            
        }
        if(sai==3) {
        	
        	 System.out.println("Bạn đã nhập sai mật khẩu 3 lần.");
             quen_mat_khau(); // Gọi phương thức quên mật khẩu
         }
        }
	}
	
	public void nhaptiengui() {
	}
	
	public void nhaptienrut() {
	}
	
	public void thongtin() {
		
	}
	
	public void doimatkhau() {
		int sai2=0;
	        
	        while(sai2<3) {
	        System.out.print("Nhập lại mật khẩu cũ: ");
	        String matkhaucu = sc.nextLine();
	        
	        if (!matkhaucu.equals(matkhau)) {
	            System.out.println("Mật khẩu sai.");
	            sai2+=1;
	            return;
	        }

	        System.out.print("Nhập mật khẩu mới: ");
	        String matkhaumoi = sc.nextLine();
	        
	        if (matkhaumoi.length() < 6) {
	            System.out.println("Mật khẩu mới phải có ít nhất 6 ký tự.");
	            return;
	        }

	        System.out.print("Nhập lại mật khẩu mới: ");
	        String matkhauxacnhan = sc.nextLine();
	        
	        if (!matkhaumoi.equals(matkhauxacnhan)) {
	            System.out.println("Mật khẩu xác nhận không khớp.");
	            return;
	        }

	       
	        matkhau= matkhaumoi;
	        System.out.println("Đã đổi mật khẩu thành công.");
	    }
	        if (sai2 == 3) {
	            System.out.println("Bạn đã nhập sai mật khẩu cũ 3 lần.");
	            quen_mat_khau(); // Gọi phương thức quên mật khẩu
	        }}
	
	public void xacthucmatkhau() {
	    

	    System.out.println("Nhập mật khẩu: ");
	    String matkhauxacthuc = sc.nextLine();
	    
	    if (matkhau.equals(matkhauxacthuc)) {
	        System.out.println("Đã xác nhận mật khẩu đúng!");
	    } else {
	        System.out.println("Mật khẩu xác nhận không khớp.");
	    }
	}

	public void quen_mat_khau() {
		
		System.out.println("nhap so dien thoai cua ban");
		String SDTxacnhan=sc.nextLine();
		System.out.println("nhap can cuoc cua ban");
		String CCCDxacnhan=sc.nextLine();
		if(!SDTxacnhan.equals(sdt)) {
			System.out.println("số điện thoại đã sai");
			return;
		}
		if(!CCCDxacnhan.equals(cccd)) {
			System.out.println("sai căn cươc công dân");
		}
		SDTxacnhan=sdt ;
		CCCDxacnhan = cccd;
		System.out.println("nhap mat khau moi cua ban");
		String matkhaumoi = sc.nextLine();
        
        if (matkhaumoi.length() < 6) {
            System.out.println("Mật khẩu mới phải có ít nhất 6 ký tự.");
            return;
        }

        System.out.print("Nhập lại mật khẩu mới: ");
        String matkhauxacnhan = sc.nextLine();
        
        if (!matkhaumoi.equals(matkhauxacnhan)) {
            System.out.println("Mật khẩu xác nhận không khớp.");
            return;
        }

       
        matkhauxacnhan = matkhaumoi;
        System.out.println("Đã đổi mật khẩu thành công.");
    }
@Override
public void thongtintaikhoan() {
	System.out.println("hoten:"+tentaikhoan);
	System.out.println("stk:"+sotaikhoan);
	System.out.println("sodu:"+sodu);
}
	
	
}

