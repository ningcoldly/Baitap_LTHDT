package Chuong1;

public class Bai16 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Vui long nhap 2 tham so a va b!");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }
}
