package Chuong1;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Day la so 0.");
        } else if (n % 2 == 0) {
            System.out.println("Day la so chan.");
        } else {
            System.out.println("Day la so le.");
        }

        sc.close();
    }
}
