package tuan5THDT;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B7Student2 {
    private List<B7SINHVIEN> students; // Danh sách sinh viên

    public B7Student2() {
        students = new ArrayList<>();
    }

    // Thêm sinh viên
    public void addStudent(B7SINHVIEN student) {
        students.add(student);
        System.out.println("Thêm sinh viên thành công.");
    }

    // Xóa sinh viên theo mã
    public void removeStudent(int studentId) {
        B7SINHVIEN studentToRemove = null;
        for (B7SINHVIEN student : students) {
            if (student.getMasv() == studentId) { // Sử dụng getMasv() để so sánh
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Đã xóa sinh viên có mã: " + studentId);
        } else {
            System.out.println("Không tìm thấy sinh viên với mã: " + studentId);
        }
    }

    // Tìm kiếm sinh viên theo mã
    public B7SINHVIEN findStudentById(int studentId) {
        for (B7SINHVIEN student : students) {
            if (student.getMasv() == studentId) { // Sử dụng getMasv()
                return student;
            }
        }
        return null; // Không tìm thấy
    }

    // In danh sách sinh viên
    public void printStudents() {
        for (B7SINHVIEN student : students) {
            System.out.println(student);
        }
    }
}
