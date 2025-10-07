package Chuong1;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }

        System.out.println("So luong ky tu la so trong chuoi: " + count);
        sc.close();
    }
}
