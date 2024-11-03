package taikhoannganhang;
import java.util.Scanner;
public class taikhoan {
	
			private String CCCD;
			public String SDT;
			private String soTaiKhoan;
			public String HoTen;
			private  String matKhauTaiKhoan;
			public int sodu;
			 private boolean isRegistered = false;
			
			
			
			
			
			public taikhoan(String cCCD, String sDT, String soTaiKhoan, String hoTen, String matKhauTaiKhoan, int sodu,
					boolean isRegistered) {
				
				CCCD = cCCD;
				SDT = sDT;
				this.soTaiKhoan = soTaiKhoan;
				HoTen = hoTen;
				this.matKhauTaiKhoan = matKhauTaiKhoan;
				this.sodu = sodu;
				this.isRegistered = isRegistered;
			}
			public void DangKy() {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("nhap ho ten ban:");
				 HoTen= sc.nextLine();
				
				System.out.println("nhap sdt cua ban:");
				 SDT=sc. nextLine();
				
				System.out.println("Can Cuoc Cong Dan Cua Ban:");
				 CCCD=sc.nextLine();
				
				System.out.print("Nhập số tài khoản: ");
		         soTaiKhoan = sc.nextLine();
		        
		        System.out.print("Nhập mật khẩu: ");
		         matKhauTaiKhoan = sc.nextLine();	
		        
				if(SDT.length()>11 && SDT.length() <10) {
					System.out.println("sdt khong dung!!!!!");
					return;
				}
				if(CCCD.length()!=12) {
					System.out.println("cccd cua ban khong dung");
					return;
				}
				isRegistered = true; 
				System.out.println("tao tai khoan thanh cong !!!!!");
				
				
		        
			}
			public void DangNhap() {
				if (!isRegistered) { // Kiểm tra nếu tài khoản chưa đăng ký
		            System.out.println("Bạn chưa có tài khoản. Vui lòng đăng ký trước!");
		            DangKy(); // Gọi phương thức đăng ký
		            return; // Kết thúc phương thức sau khi đăng ký
		        }
				int sai=0;
			
				Scanner sc = new Scanner(System.in);
			while(sai<3) {
		        System.out.print("Nhập số tài khoản: ");
		        String soDangNhap = sc.nextLine();
		        
		        System.out.print("Nhập mật khẩu: ");
		        String matKhauNhap = sc.nextLine();
		        
		        

		        if (soDangNhap.equals(soTaiKhoan) && matKhauNhap.equals(matKhauTaiKhoan)) {
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
				int tiengui;
				Scanner sc= new Scanner(System.in);
				System.out.println("nhap so tien ban muon gui ");
				tiengui= sc.nextInt();
				if (tiengui > 0) {
		             sodu+= tiengui;
		            System.out.println("Bạn đã gửi thành công " + tiengui + ". Số dư hiện tại là: " + sodu);
		        } else {
		            System.out.println("Số tiền gửi phải lớn hơn 0.");
		        }
			}
			public void nhaptienrut() {
				int tienrut;
				Scanner sc= new Scanner(System.in);
				System.out.println("nhap so tien ban muon rut ");
				tienrut= sc.nextInt();
				if (tienrut < sodu && sodu-tienrut>50) {
					xacthucmatkhau();
		             sodu-= tienrut;
		            System.out.println("Bạn đã rút thành công " + tienrut + ". Số dư hiện tại là: " + sodu);
		        } else {
		            System.out.println("Không rút được !!!Số tiền không thoả.");
		        }
			}
			public void doimatkhau() {
				int sai2=0;
			        Scanner sc = new Scanner(System.in);
			        while(sai2<3) {
			        System.out.print("Nhập lại mật khẩu cũ: ");
			        String matkhaucu = sc.nextLine();
			        
			        if (!matkhaucu.equals(matKhauTaiKhoan)) {
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

			       
			        matKhauTaiKhoan = matkhaumoi;
			        System.out.println("Đã đổi mật khẩu thành công.");
			    }
			        if (sai2 == 3) {
			            System.out.println("Bạn đã nhập sai mật khẩu cũ 3 lần.");
			            quen_mat_khau(); // Gọi phương thức quên mật khẩu
			        }}
			public void xacthucmatkhau() {
				String matkhau;
				Scanner sc= new Scanner(System.in);
				System.out.println("Nhap mat khau ");
				matkhau= sc.nextLine();
				if (!matkhau.equals(matKhauTaiKhoan)) {
		            System.out.println("Mật khẩu xác nhận không khớp.");
		            return;
		        }
				matKhauTaiKhoan=matkhau;
				
				System.out.println("Đã xác nhận mật khẩu đúng!");
				
				
			}
			public void quen_mat_khau() {
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("nhap so dien thoai cua ban");
				String SDTxacnhan=sc.nextLine();
				System.out.println("nhap can cuoc cua ban");
				String CCCDxacnhan=sc.nextLine();
				if(!SDTxacnhan.equals(SDT)) {
					System.out.println("số điện thoại đã sai");
					return;
				}
				if(!CCCDxacnhan.equals(CCCD)) {
					System.out.println("sai căn cươc công dân");
				}
				SDTxacnhan=SDT ;
				CCCDxacnhan = CCCD;
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

		       
		        matKhauTaiKhoan = matkhaumoi;
		        System.out.println("Đã đổi mật khẩu thành công.");
		    }
			public void thongtintaikhoan(tai_Khoan_Tiet_Kiem tinhlai, tai_khoan_giao_dich tiengiaodich) {
				
				System.out.println("Họ Tên: "+this.HoTen);
				System.out.println("Số TK: "+this.soTaiKhoan);
				System.out.println("SDT: "+this.SDT);
				System.out.println("So Dư TK: "+this.sodu);
				
				System.out.println("Số dư tiền tiết kiệm:"+tinhlai.getTientietkiem());
				System.out.println("số tiền giao dịch gần đây nhất" +tiengiaodich.getPhigiaodich());
				
			}
			
			
				
			

			}


			
			

			 



