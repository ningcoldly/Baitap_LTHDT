package Chuong1;

import java.util.Scanner;

public class bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap M (hang): ");
        int m = sc.nextInt();
        System.out.print("Nhap N (cot): ");
        int n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
