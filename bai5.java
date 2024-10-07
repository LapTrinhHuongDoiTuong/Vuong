package tuan4TLHDT;
import java.util.Scanner;
public class bai5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		int b;
		System.out.println("nhập vào 2 số nguyên a b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		int UCLN=a;
		int bcnn;
		int A=a;
		int B=b;
		while(a!=b){
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		UCLN=a;
		bcnn=(A*B)/UCLN;
		
		System.out.println("ước chung lớn nhất a b là "+ UCLN);
		System.out.println("bội chung nhỏ nhất a b là "+ bcnn);
		sc.close();
		
}
}
