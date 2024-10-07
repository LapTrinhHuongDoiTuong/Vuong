package tuan3THLTHDT;
import java.util.Scanner;
public class bai2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Nhập vào điểm trung bình:");
	double dtb;
	dtb= sc.nextDouble();
	if(dtb>=8.5)
		System.out.println("ten ten chúc mừng bạn đạt học sinh giỏi :3");
	else
		if(8.5>dtb && dtb>=6.5)
			System.out.println("bạn được học sinh khá ->Không sao cố rắng thêm nào");
		else
			if(6.5>dtb && dtb>=5.0)
				System.out.println("bạn được học sinh trung bình hu hu");
			else
				System.out.println("bạn hơi lơ là rồi học sinh yếu nhá");
	}

}
