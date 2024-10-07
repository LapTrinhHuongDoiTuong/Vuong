package tuan4TLHDT;
import java.util.Scanner;
public class bai2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=9;
	System.out.println("bảng cửu chương");
	for(int i=1; i<=n; i++)
	 for(int j=1;j<=n;j++)
	 {
		 System.out.printf("%d x %d=%2d\t", i , j , i * j );
	 }
	
	}

}
