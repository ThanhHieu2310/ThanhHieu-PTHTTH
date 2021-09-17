package phattrienhethongtichhop;

import java.util.Scanner;

public class Phuongtrinhbac2 {

	public static void main(String[] args) {
		double a, b, c, x1, x2, D;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a !=0: ");
		a = scanner.nextDouble();
		System.out.println("nhap b !=0: ");
		b = scanner.nextDouble();
		System.out.println("nhap c !=0: ");
		c = scanner.nextDouble();
		System.out.println("Phuong trinh bac 2 cua ban: " +a+"x^2 +"+b+"x+" +c+"=0");
		D = Math.pow(b, 2) - 4 *a *c;
		if (D<0)
		{
			System.out.println("Phuong trinh vo nghiem");
		}else if(D == 0)
		{
			x1 =-b / (2*a);
			System.out.println("Phuong trinh co nghiem duy nhat la: x1 = x2 = "+ x1);
		}else {
			x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem: x1 = "+x1+ " va x2 = "+x2);
		}
		
	}

}
