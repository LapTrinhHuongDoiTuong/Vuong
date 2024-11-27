package nganhang_taikhoan;

import java.util.HashMap;
import java.util.Scanner;

public class main_nganhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, taikhoan> danhSachTaiKhoan = new HashMap<>();

        // Khởi tạo các tài khoản
        taikhoangiaodich tkgd = new taikhoangiaodich("", "", "","", "", 0, "","", 0, 0);
        taikhoantietkiem tktk = new taikhoantietkiem("","","","","", 0, 0, 0, 0, 0);
        taikhoantindung tktd = new taikhoantindung("","","","","", 0, 0, 0, 0, 0, 0);
        vay v1 = new vay("","","","","", 0, 0, 0, 0, 0, 0, 0);
        QuanLyTaiKhoan qltk = new QuanLyTaiKhoan();

        int choice;
        do {
            System.out.println("Chọn một tùy chọn:");
            System.out.println("1. Đăng ký  2. Đăng nhập  3. Quản lý các tài khoản  4. Thoát");
            choice = sc.nextInt();
            sc.nextLine(); // Tiêu thụ dòng trống sau khi đọc số nguyên

            switch (choice) {
                case 1: // Đăng ký
                    System.out.println("Đăng ký tài khoản mới:");
                    taikhoan taiKhoanMoi = new taikhoantietkiem("", "", "", "", "", 0, 0, 0.02, 0, 0);
                    taiKhoanMoi.dangky();
                    danhSachTaiKhoan.put(taiKhoanMoi.getSotaikhoan(), taiKhoanMoi);
                    break;

                case 2: // Đăng nhập
                    System.out.println("Đăng nhập tài khoản:");
                    System.out.print("Nhập số tài khoản: ");
                    String soTaiKhoanDangNhap = sc.nextLine();
                    if (danhSachTaiKhoan.containsKey(soTaiKhoanDangNhap)) {
                        taikhoan taiKhoanDangNhap = danhSachTaiKhoan.get(soTaiKhoanDangNhap);
                        taiKhoanDangNhap.dangnhap();

                        int chucnang;
                        do {
                            System.out.println("Chọn chức năng:");
                            System.out.println("1. Giao dịch chuyển/rút tiền 2. Gửi/rút tiền tiết kiệm 3. Dùng thẻ tín dụng 4. Vay tiền 5. Đổi mật khẩu 6. Thoát");
                            chucnang = sc.nextInt();
                            sc.nextLine(); // Tiêu thụ dòng trống

                            switch (chucnang) {
                                case 1: // Giao dịch
                                	int gd;
                                    do {
                                    	System.out.println("1. Gửi 2. Chuyển 3. Thoát");
                                        
                                        gd = sc.nextInt();
                                        sc.nextLine(); // Tiêu thụ dòng trống
                                        switch (gd) {
                                            case 1:
                                                tkgd.nhaptiengui();
                                                break;
                                            case 2:
                                                tkgd.nhaptienrut();
                                                break;
                                            case 3:
                                                System.out.println("Thoát giao dịch.");
                                                break;
                                            default:
                                                System.out.println("Lựa chọn không hợp lệ.");
                                        }
                                    } while (gd != 3);
                                    break;
                                case 2:
                                    
                                    int tk ;
                                    sc.nextLine(); // Tiêu thụ dòng trống
                                    do {
                                    	System.out.println("1. Gửi 2. Chuyển 3. Kiểm tra 4. Thoát");
                                    	tk = sc.nextInt();
                                        switch (tk) {
                                            case 1:
                                                tktk.nhaptiengui();
                                                break;
                                            case 2:
                                                tktk.nhaptienrut();
                                                break;
                                            case 3:
                                                tktk.thongtintaikhoan();
                                                break;
                                            case 4:
                                                break;
                                        }
                                    } while (tk != 4);
                                    
                                    break;

                                case 3:
                                    
                                    int td ;
                                    sc.nextLine(); // Tiêu thụ dòng trống
                                    do {
                                    	System.out.println("1. Thanh toán 2. Trả nợ 3. Thoát");
                                    	td = sc.nextInt();
                                        switch (td) {
                                            case 1:
                                                tktd.vay(0);
                                                tktd.nhaptienrut();
                                                break;
                                            case 2:
                                                tktd.tinhlai();
                                                tktd.trano(0);
                                                break;
                                            case 3:
                                                tktk.thongtintaikhoan();
                                                break;
                                            case 4:
                                                break;
                                        }
                                    } while (td != 4);
                                    break;

                                case 4:
                                    
                                    int v;
                                    sc.nextLine(); // Tiêu thụ dòng trống
                                    do {
                                    	System.out.println("1. Vay 2. Trả nợ 3. Kiểm tra 4. Thoát");
                                    	v = sc.nextInt();
                                        switch (v) {
                                            case 1:
                                                v1.vay(0);
                                                break;
                                            case 2:
                                                v1.tinhlai();
                                                v1.trano(0);
                                                break;
                                            case 3:
                                                v1.thongtintaikhoan();
                                                break;
                                            case 4:
                                                break;
                                        }
                                    } while (v != 4);
                                    break;

                                case 5:
                                    taikhoan taiKhoanDoiMatKhau = new taikhoantietkiem("", "", "", "", "", 0, 0, 0.02, 0, 0);
                                    taiKhoanDoiMatKhau.doimatkhau();
                                    break;
                                case 6: // Thoát
                                    System.out.println("Thoát đăng nhập.");
                                    break;

                                default:
                                    System.out.println("Lựa chọn không hợp lệ.");
                            }
                        } while (chucnang != 6);
                    } else {
                        System.out.println("Số tài khoản không tồn tại.");
                    }
                    break;

                case 3: // Quản lý tài khoản
                    int quanly;
                    do {
                        System.out.println("Chọn một tùy chọn:");
                        System.out.println("1. Thêm tài khoản  2. Xóa tài khoản  3. Chuyển đổi tài khoản  4. Xem thông tin  5. Thoát");
                        quanly = sc.nextInt();
                        sc.nextLine(); // Tiêu thụ dòng trống

                        switch (quanly) {
                            case 1:
                                taikhoan taiKhoanQuanLy = new taikhoantietkiem("", "", "", "", "", 0, 0, 0.02, 0, 0);
                                taiKhoanQuanLy.dangky();
                                qltk.themTaiKhoan(taiKhoanQuanLy);
                                break;
                            case 2:
                                System.out.print("Nhập số tài khoản cần xóa: ");
                                String soTaiKhoanXoa = sc.nextLine();
                                qltk.xoaTaiKhoan(soTaiKhoanXoa);
                                break;
                            case 3:
                                System.out.print("Nhập số tài khoản cũ: ");
                                String soTaiKhoanCu = sc.nextLine();
                                System.out.print("Nhập số tài khoản mới: ");
                                String soTaiKhoanMoi = sc.nextLine();
                                qltk.chuyenDoiTaiKhoan(soTaiKhoanCu, soTaiKhoanMoi);
                                break;
                            case 4:
                                qltk.thongtintaikhoan();
                                break;
                            case 5:
                                System.out.println("Thoát quản lý tài khoản.");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ.");
                        }
                    } while (quanly != 5);
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 4);

        sc.close();
    }
}
