package Chuong1;

import java.util.Scanner;

public class Bai15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
	System.out.println("nhap so phan tu can tinh" );
	int m = sc.nextInt();
	for(int i= 0; i<m; i++) {
		System.out.println("nhap phan tu thu " + i + ": ");
		int n= sc.nextInt();
		
		  if (n > max) {
              max = n;
          }
          if (n < min) {
              min = n;
          }
      }

      System.out.println("So lon nhat la: " + max);
      System.out.println("So nho nhat la: " + min);

}
}
