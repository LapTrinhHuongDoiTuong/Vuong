package tuan3THLTHDT;
import java.util.Scanner;
public class bai4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập 3 số a b c");
		int A;
		int B;
		int C;
		A =sc.nextInt();
		B =sc.nextInt();
		C =sc.nextInt();		
		int maxAB=Math.max(A, B);
		int maxABC=Math.max(maxAB,C);	
		System.out.println("số lớn nhất là:"+ maxABC);
}
}