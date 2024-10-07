package tuan3THLTHDT;
import java.util.Scanner;
public class bai5 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập vào ba cạnh của tam giác:");
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();
	        if (a + b > c && a + c > b && b + c > a) {
	            System.out.println("Ba đoạn thẳng tạo thành một tam giác.");
	            if (a == b && b == c) {
	                System.out.println("Đây là tam giác đều.");
	            } else if (a == b || a == c || b == c) {
	                System.out.println("Đây là tam giác cân.");
	            } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
	                       Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
	                       Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
	                System.out.println("Đây là tam giác vuông.");
	            } else {
	                System.out.println("Đây là tam giác thường.");
	            }
	        } else {
	            System.out.println("Ba đoạn thẳng không tạo thành tam giác.");
	        }
	        
	        
	    }
	}