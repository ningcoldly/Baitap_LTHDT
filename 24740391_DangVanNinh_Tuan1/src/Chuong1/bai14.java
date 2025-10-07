package Chuong1;

public class bai14 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui long nhap gia tri n tu command line!");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int sum = 0;

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("n la so chan. Tong cac so le tu 1 den " + n + " la: " + sum);
        } else {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("n la so le. Tong cac so chan tu 2 den " + n + " la: " + sum);
        }
    }
}
