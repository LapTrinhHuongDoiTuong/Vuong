package tuan5THDT;

import java.util.Scanner;

public class bai4 {
    int[] ds; 

    public static int sophantuxuathiennhieunhat(int[] ds) {
        int maxCount = 0;
        int ptuXuatHienMax = ds[0];

        for (int i = 0; i < ds.length; i++) {
            int count = 0; // Khởi tạo lại count cho mỗi phần tử
            for (int j = 0; j < ds.length; j++) {
                if (ds[i] == ds[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                ptuXuatHienMax = ds[i];
            }
        }
        return ptuXuatHienMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so phan tu:");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            arr[i] = sc.nextInt(); 
        }

        int phanTuXuatHienNhieuNhat = sophantuxuathiennhieunhat(arr);
        System.out.println("Phan tu xuat hien nhieu nhat: " + phanTuXuatHienNhieuNhat);
    }
}
