package phattrienhethongtichhop;

import java.util.Scanner;

public class TinhtongN {

	public static void main(String[] args) {
		int n, S = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen n != 0: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			S = S + i;
		}
		System.out.println("tong cac so nguyen n= " + S);
	}

}
