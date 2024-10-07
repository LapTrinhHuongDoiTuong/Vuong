package tuan3THLTHDT;
import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập vào một số nguyên :");
		int num;
		num= sc.nextInt();
		if(num == 0)
			System.out.println(num + " bằng 0");
		else
		if(num > 0)
			System.out.println(num + " là số dương");
		else
			System.out.println(num + " là số âm");

	}

}
