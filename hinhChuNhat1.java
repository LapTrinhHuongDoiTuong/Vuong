package tuan6_THLTHDT;
import java.util.Scanner;
public class hinhChuNhat1 {
private double length;
private double width;
public hinhChuNhat1(double length, double width) {
	this.length=length;
	this.width=width;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length=length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width=width;
}
public double chuviHinhchunhat() {
	return (length+width)/2;
}
public double dientichHinhchunhat() {
	return length*width;
}
public void nhap() {
	Scanner sc=new Scanner(System.in);
	System.out.println("nhap vao chieu dai, chieu rong:");
	length=sc.nextDouble();
	width=sc.nextDouble();
}
}
