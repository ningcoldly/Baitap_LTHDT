package Chuong1;

import java.util.Scanner;

public class Bai19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }

        System.out.println("So lan ky tu 'a' xuat hien: " + count);
        sc.close();
    }
}
