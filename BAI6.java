package tuan5THDT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BAI6 {
    
    public void nhap(int n, List<Integer> numbers) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            int number = sc.nextInt();
            numbers.add(number); // Thêm số vào danh sách
        }
    }

    
    public void them(List<Integer> numbers, int viTri, int so) {
        if (viTri < 0 || viTri > numbers.size()) {
            System.out.println("Vị trí không hợp lệ.");
        } else {
            numbers.add(viTri-1, so); // Thêm số vào vị trí chỉ định
            System.out.println("Số " + so + " đã được thêm vào vị trí " + viTri + ".");
        }
    }

    
    public void xoaSoTaiViTri(List<Integer> numbers, int viTri) {
        if (viTri < 0 || viTri >= numbers.size()) {
            System.out.println("Vị trí không hợp lệ.");
        } else {
            int removed = numbers.remove(viTri-1); // Xóa số tại vị trí chỉ định
            System.out.println("Số " + removed + " đã được xóa tại vị trí " + viTri + ".");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BAI6 bai6 = new BAI6(); // Tạo đối tượng của lớp BAI6
        List<Integer> numbers = new ArrayList<>();

        
        System.out.print("Nhập vào số phần tử: ");
        int n = sc.nextInt();

        
        bai6.nhap(n, numbers);

        
        System.out.println("Dãy số đã nhập: " + numbers);

        
        System.out.print("Nhập số bạn muốn thêm: ");
        int so = sc.nextInt();
        System.out.print("Nhập vị trí bạn muốn thêm số: ");
        int viTri = sc.nextInt();

        bai6.them(numbers, viTri, so);

        // In ra dãy số sau khi thêm
        System.out.println("Dãy số sau khi thêm: " + numbers);

        // Xóa một số tại vị trí chỉ định
        System.out.print("Nhập vị trí bạn muốn xóa: ");
        int viTriXoa = sc.nextInt();

        bai6.xoaSoTaiViTri(numbers, viTriXoa);

        // In ra dãy số sau khi xóa
        System.out.println("Dãy số sau khi xóa: " + numbers);
    }
}
