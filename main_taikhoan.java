package taikhoannganhang;

import java.util.Scanner;

public class main_taikhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        taikhoan tk=new taikhoan(null, null, null, null, null, 0, false);
        tai_Khoan_Tiet_Kiem tktk = new tai_Khoan_Tiet_Kiem(null, null, null, null, null, 0, false, 0, 0);
        tai_khoan_giao_dich tkgd = new tai_khoan_giao_dich(null, null, null, null, null, 0, false, 0);

        int chucnang;
        
        do {
            System.out.println("Chọn chức năng (1: Đăng Ký, 2: Đăng Nhập, 0: Thoát): ");
            chucnang = sc.nextInt();
            
            switch (chucnang) {
                case 1:
                    tk.DangKy();
                    break;
                case 2:
                    tk.DangNhap();
                    
                    int phuongthuc;
                    do {
                        System.out.println("Chọn phương án (1: Gửi tiền, 2: Rút tiền, 3: Đổi mật khẩu, 4: Kiểm tra thông tin tài khoản, 5: Tính lãi, 6: Giao dịch, 0: Thoát): ");
                        phuongthuc = sc.nextInt();

                        switch (phuongthuc) {
                            case 1:
                                tk.nhaptiengui();
                                System.out.println("Số dư tài khoản là: " + tk.sodu);
                                break;
                            case 2:
                                tk.nhaptienrut();
                                System.out.println("Số dư tài khoản là: " + tk.sodu);
                                break;
                            case 3:
                                tk.doimatkhau();
                                break;
                            case 4:
                                tk.thongtintaikhoan(tktk, tkgd);
                                break;
                            case 5:
                                tktk.tinhLai();
                                break;
                            case 6:
                                tkgd.tiengiaodich();
                                break;
                            case 0:
                                System.out.println("Thoát chương trình.");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                        }
                    } while (phuongthuc != 0);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (chucnang != 0);

        sc.close();
    }
}
