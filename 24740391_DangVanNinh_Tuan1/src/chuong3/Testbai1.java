package chuong3;

import java.util.Scanner;


public class Testbai1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.print("Nhập chiều dài: ");
     double ChieuDai = sc.nextDouble();
     System.out.print("Nhập chiều rộng: ");
     double ChieuRong = sc.nextDouble();
     bai1 hcn = new bai1(ChieuDai, ChieuRong);
     
     System.out.println("KetQua");
     System.out.println(hcn.toString());
}
}
