package nganhang_taikhoan;

import java.util.HashMap;

public class QuanLyTaiKhoan {
    private HashMap<String, taikhoan> danhSachTaiKhoan = new HashMap<>();

    // Thêm tài khoản vào danh sách
    public void themTaiKhoan(taikhoan taiKhoan) {
        if (danhSachTaiKhoan.containsKey(taiKhoan.getSotaikhoan())) {
            System.out.println("Tài khoản đã tồn tại.");
            return;
        }
        danhSachTaiKhoan.put(taiKhoan.getSotaikhoan(), taiKhoan);
        System.out.println("Thêm tài khoản thành công.");
    }

    // Xóa tài khoản khỏi danh sách
    public void xoaTaiKhoan(String soTaiKhoan) {
        if (!danhSachTaiKhoan.containsKey(soTaiKhoan)) {
            System.out.println("Tài khoản không tồn tại.");
            return;
        }
        danhSachTaiKhoan.remove(soTaiKhoan);
        System.out.println("Xóa tài khoản thành công.");
    }

    // Chuyển đổi thông tin tài khoản (cập nhật số tài khoản)
    public void chuyenDoiTaiKhoan(String soTaiKhoanCu, String soTaiKhoanMoi) {
        if (!danhSachTaiKhoan.containsKey(soTaiKhoanCu)) {
            System.out.println("Tài khoản cũ không tồn tại.");
            return;
        }
        if (danhSachTaiKhoan.containsKey(soTaiKhoanMoi)) {
            System.out.println("Số tài khoản mới đã tồn tại.");
            return;
        }
        taikhoan taiKhoan = danhSachTaiKhoan.remove(soTaiKhoanCu);
        taiKhoan.setSotaikhoan(soTaiKhoanMoi);
        danhSachTaiKhoan.put(soTaiKhoanMoi, taiKhoan);
        System.out.println("Chuyển đổi tài khoản thành công.");
    }

    // Hiển thị thông tin tất cả tài khoản
    public void thongtintaikhoan() {
        if (danhSachTaiKhoan.isEmpty()) {
            System.out.println("Danh sách tài khoản rỗng.");
            return;
        }
        for (taikhoan tk : danhSachTaiKhoan.values()) {
            tk.thongtintaikhoan();
            System.out.println("------------------------");
        }
    }

    // Tìm tài khoản theo số tài khoản
    public taikhoan timTaiKhoan(String soTaiKhoan) {
        return danhSachTaiKhoan.get(soTaiKhoan);
    }
    
 // Thêm phương thức chuyển tiền vào trong class QuanLyTaiKhoan
    public void chuyenTien(String soTaiKhoanNguon, String soTaiKhoanDich, double soTien) {
        taikhoan taiKhoanNguon = danhSachTaiKhoan.get(soTaiKhoanNguon);
        taikhoan taiKhoanDich = danhSachTaiKhoan.get(soTaiKhoanDich);

        if (taiKhoanNguon == null) {
            System.out.println("Tài khoản nguồn không tồn tại.");
            return;
        }
        if (taiKhoanDich == null) {
            System.out.println("Tài khoản đích không tồn tại.");
            return;
        }

        // Kiểm tra số dư tài khoản nguồn
        if (taiKhoanNguon.getSodu() < soTien) {
            System.out.println("Số dư tài khoản nguồn không đủ.");
            return;
        }

        // Thực hiện chuyển tiền
        taiKhoanNguon.setSodu(taiKhoanNguon.getSodu() - soTien);
        taiKhoanDich.setSodu(taiKhoanDich.getSodu() + soTien);

        System.out.println("Chuyển tiền thành công!");
        System.out.printf("Số dư tài khoản nguồn: %.2f\n", taiKhoanNguon.getSodu());
        System.out.printf("Số dư tài khoản đích: %.2f\n", taiKhoanDich.getSodu());
    }

}

