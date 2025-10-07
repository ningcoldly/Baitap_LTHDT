package Chuong1;

import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}

