package tuan5THDT;
import java.util.Scanner;
public class B7Studentmain {

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        B7Student2 B7Student2 = new B7Student2();

	        while (true) {
	            System.out.println("1. Thêm sinh viên");
	            System.out.println("2. Xóa sinh viên");
	            System.out.println("3. Tìm kiếm sinh viên theo mã");
	            System.out.println("4. In danh sách sinh viên");
	            System.out.println("0. Thoát");
	            System.out.print("Chọn chức năng: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // Đọc dòng trống

	            switch (choice) {
	                case 1:
	                    System.out.print("Nhập mã sinh viên: ");
	                    int masv = sc.nextInt();
	                    sc.nextLine(); // Đọc dòng trống
	                    System.out.print("Nhập tên sinh viên: ");
	                    String ten = sc.nextLine();
	                    System.out.print("Nhập điểm trung bình: ");
	                    double dtb = sc.nextDouble();
	                    B7Student2.addStudent(new B7SINHVIEN(masv, ten, dtb));
	                    break;
	                case 2:
	                    System.out.print("Nhập mã sinh viên cần xóa: ");
	                    int idToRemove = sc.nextInt();
	                    B7Student2.removeStudent(idToRemove);
	                    break;
	                case 3:
	                    System.out.print("Nhập mã sinh viên cần tìm: ");
	                    int idToFind = sc.nextInt();
	                    B7SINHVIEN foundStudent = B7Student2.findStudentById(idToFind);
	                    if (foundStudent != null) {
	                        System.out.println("Thông tin sinh viên: " + foundStudent);
	                    } else {
	                        System.out.println("Không tìm thấy sinh viên với mã: " + idToFind);
	                    }
	                    break;
	                case 4:
	                	B7Student2.printStudents();
	                    break;
	                case 0:
	                    System.out.println("Thoát chương trình.");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Chọn chức năng không hợp lệ.");
	            }
	        }
	    }
	}
}
	

