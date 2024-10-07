package tuan4TLHDT;
import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		int s=0;
		System.out.println("nhap so n: ");
		n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.println("tổng " + s);
	}
}
