package tuan3THLTHDT;
import java.util.Scanner;
public class bai3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập vào ba số a,b,c tương ứng ax+by+c=0");
		double a;
		double b;
		double c;
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		double delta;
		delta=(b*b-4*a*c);
		double squareRoot = Math.sqrt(delta);
		if(delta<0)
			System.out.println("phương trình vo nghiệm");
		else
			if(delta==0)
				System.out.println("phương trình có nghiệm kép: x1=x2= " +(-b/2*a) );
			else
				System.out.println("phương trình có 2 nghiẹm phân biệt: x1= " + ((-b+squareRoot)/2*a) + " x2= " + ((-b-squareRoot)/2*a));
	}

}
