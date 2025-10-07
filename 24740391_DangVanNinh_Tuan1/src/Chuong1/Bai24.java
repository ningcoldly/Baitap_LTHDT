package Chuong1;

import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println("Tong = " + sum);
        sc.close();
    }
}
