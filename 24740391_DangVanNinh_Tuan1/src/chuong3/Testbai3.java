package chuong3;

public class Testbai3 {
    public static void main(String[] args) {
     
        bai3 xe1 = new bai3("Nguyen Van A", "Wave Alpha", 50, 10000000,0);
        bai3 xe2 = new bai3("Tran Thi B", "Air Blade", 150, 10000000,0);
        bai3 xe3 = new bai3("Le Van C", "SH 300i", 250, 10000000,0);


        System.out.printf("%-20s %-15s %10s %10s %15s\n",
                "CHỦ XE", "LOẠI XE", "TRỊ GIÁ", "D.TÍCH", "THUẾ (VNĐ)");
        System.out.println("--------------------------------------------------------------------------");

        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }
}
