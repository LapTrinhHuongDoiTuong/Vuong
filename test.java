package tuan6;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		taikhoan tk= new taikhoan(0, null, null, 0);
		tk.nhap_ten_tai_khoan();
		tk.nhap_so_tai_khoan();
		tk.nhap_mat_khau();
		tk.nhap_so_du();
		int chon;
        do {
            System.out.println("Chọn phương án (1: Gửi tiền, 2: Rút tiền,3:Đổi mật khẩu, 0: Thoát): ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    tk.nhaptiengui();
                    System.out.println("Số dư tài khoản là: " + tk.getSodu());
                    break;
                case 2:
                    tk.nhaptienrut();
                    System.out.println("Số dư tài khoản là: " + tk.getSodu());
                    break;
                case 3:
                	tk.doimatkhau();
                	break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (chon != 0); // Lặp cho đến khi người dùng chọn thoát

        sc.close(); // Đóng Scanner
    }

}
