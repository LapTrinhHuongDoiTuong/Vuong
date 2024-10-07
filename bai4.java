package tuan4TLHDT;
import java.util.Scanner;
public class bai4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("nhap vào số nguyên:");
		a=sc.nextInt();
		if(a>1)
		{
			for(int i=2;i<a;i++)
			
				if( a%i==0)
				{
					System.out.println(a + "Không phải số nguyên tố");
			break;
				}
				else
				
					System.out.println(a+ "là số nguyên tố");
				
			
		}
		else
		{
			System.out.println(a + "khong phải số nguyên tố");
		}
	}

}
