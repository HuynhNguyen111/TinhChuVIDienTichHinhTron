import java.util.Scanner;
import java.math.*;
public class main {

	public static void main(String[] args) {
		float r,s,c;
		final float pi=(float)3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ban kinh hinh tron");
		r=sc.nextFloat();
		System.out.println("Chu vi la: "+2*r*pi);
		System.out.printf("chu vi la: %.1f",(2*r*pi));
		System.out.println("\ndien tich la: "+pi*r*r);
		System.out.printf("dien tich la: %.1f",(pi*r*r));
	}

}
