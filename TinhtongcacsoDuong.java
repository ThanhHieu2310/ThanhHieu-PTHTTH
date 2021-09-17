package phattrienhethongtichhop;

import java.util.Scanner;

public class TinhtongcacsoDuong {

	public static void main(String[] args) {
        System.out.println("Nhập so phan tu mong muon: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double Sum = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        
        for(int i=0; i<arr.length; i++){
          if (arr[i] > 0) {
        	  Sum =Sum + arr[i];
          } 
        	// Sum = Sum + arr[i];
        }
        System.out.format("Kết quả là: %.3f", Sum);
    }
}
		



