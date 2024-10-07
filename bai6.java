package tuan3THLTHDT;
import java.util.Scanner;
public class bai6 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("nhập vào 2 số tn:");
	int a;
	int b;
	a= sc.nextInt();
	b=sc.nextInt();
	
	System.out.println("nhập vào phép toán bạn muốn thực hiện");
	
	System.out.println("1.cộng");
	System.out.println("2.trừ");
	System.out.println("3.nhân " );
	System.out.println("4.chia");
	System.out.println("nhập số tương ứng");
	int bien;
	bien= sc.nextInt();
	if(bien<5 && bien>0)
	{
	 if(bien == 1)
		System.out.println("cộng:a+b= "+(a+b));
	 if(bien ==2)
		System.out.println("trừ:a-b= "+(a-b));	
	 if(bien ==3)
		System.out.println("nhân:a*b= "+(a*b));
	 if(bien ==4)
		System.out.println("chia:a/b= "+(a/b));
	}
	else
	{
		System.out.println("Không tồn tại công thức yêu cầu");
	}
	}

}
