package Chuong1;

import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        int count = 0, num = 2, sum = 0;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Tong " + n + " so nguyen to dau tien la: " + sum);
        sc.close();
    }
}
