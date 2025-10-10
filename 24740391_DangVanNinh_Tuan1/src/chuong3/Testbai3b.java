package chuong3;

import java.time.LocalDate;

public class Testbai3b {
    public static void main(String[] args) {

        bai3b h1 = new bai3b(
                "TP01",
                "Thịt heo",
                120000,                           
                LocalDate.of(2025, 10, 1),        
                LocalDate.of(2025, 10, 15)              
, 0
        );

      
        bai3b h2 = new bai3b(
                "TP02",
                "Trứng gà",
                30000,
                LocalDate.of(2025, 10, 5),
                LocalDate.of(2025, 10, 4)            
, 0
        );

       
        bai3b h3 = new bai3b("TP03", 0);


        System.out.printf("%-10s %-20s %18s %15s %15s %10s\n",
                "MÃ HÀNG", "TÊN HÀNG", "ĐƠN GIÁ (VNĐ)", "NGÀY SX", "NGÀY HH", "TRẠNG THÁI");
        System.out.println("---------------------------------------------------------------------------------------------");


        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
    }
}
