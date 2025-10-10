package chuong3;

import java.time.LocalDate;

public class Testbai3b {
    public static void main(String[] args) {
        // 1) Đối tượng hợp lệ
        bai3b h1 = new bai3b(
                "TP01",
                "Thịt heo",
                120000,                                   // doGia
                LocalDate.of(2025, 10, 1),               // ngaySanXuat
                LocalDate.of(2025, 10, 15)               // ngayHetHan
, 0
        );

        // 2) Cố tình cho ngày hết hạn < ngày sản xuất (để xem xử lý hiện tại)
        bai3b h2 = new bai3b(
                "TP02",
                "Trứng gà",
                30000,
                LocalDate.of(2025, 10, 5),
                LocalDate.of(2025, 10, 4)                // sai
, 0
        );

        // 3) Dùng constructor chỉ có mã hàng
        bai3b h3 = new bai3b("TP03", 0);

        // In tiêu đề
        System.out.printf("%-10s %-20s %18s %15s %15s %10s\n",
                "MÃ HÀNG", "TÊN HÀNG", "ĐƠN GIÁ (VNĐ)", "NGÀY SX", "NGÀY HH", "TRẠNG THÁI");
        System.out.println("---------------------------------------------------------------------------------------------");

        // In thông tin từng hàng
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
    }
}
