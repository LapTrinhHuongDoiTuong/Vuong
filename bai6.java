package tuan4TLHDT;
import java.util.Scanner;
public class bai6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("Nhập vào số nguyên: ");
		a= sc.nextInt();
		int number = a;
		int so=0;
		while (number!=0)
		{
			so=so*10+(number%10);
			number=number/10;
		}
		if(a==so)
		{
			System.out.println(a+" đây là số đối");
		}
		else
		{
			System.out.println(a+" đây không là số đối");
		}
	
	}

}
