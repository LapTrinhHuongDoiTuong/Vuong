package tuan5THDT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Tạo danh sách để lưu trữ các số nguyên
        List<Integer> numbers = new ArrayList<>();
        
        // Nhập số lượng phần tử
        System.out.print("Nhập vào số phần tử: ");
        int spt = sc.nextInt();
        
        // Nhập các phần tử
        for (int i = 1; i <= spt; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            int number = sc.nextInt();
            numbers.add(number); // Thêm số vào danh sách
        }
        
        // In các phần tử của danh sách
        System.out.println("Các phần tử trong danh sách:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // Đóng scanner
        sc.close();
    }
}
