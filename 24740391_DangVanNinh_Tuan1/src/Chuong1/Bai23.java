package Chuong1;

import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("Uoc so chung lon nhat la: " + a);
        sc.close();
    }
}
