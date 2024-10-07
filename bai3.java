package tuan4TLHDT;
import java.util.Scanner;
public class bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        long giaithua = 1; 
        int i = 1; 

        while (i <= n) {
            
        	{
                giaithua *= i; 
            }
            i++; 
	}

        System.out.println(n + "! = " + giaithua);
        sc.close(); 
    }
}
