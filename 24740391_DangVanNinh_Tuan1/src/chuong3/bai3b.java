package chuong3;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class bai3b {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public bai3b(String maHang, double donGia) {
        this.maHang = (maHang == null || maHang.trim().isEmpty()) ? "000" : maHang.trim();
        this.tenHang = "Chưa xác định";
        this.donGia = (donGia > 0) ? donGia : 0.0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = this.ngaySanXuat.plusDays(1);
    }

    public bai3b(String maHang, String tenHang, double doGia, LocalDate ngaySanXuat, LocalDate ngayHetHan, double donGia) {
        this.maHang = (maHang == null || maHang.trim().isEmpty()) ? "000" : maHang.trim();
        this.tenHang = (tenHang == null || tenHang.trim().isEmpty()) ? "Chưa xác định" : tenHang.trim();
        this.donGia = (donGia > 0) ? donGia : (doGia > 0 ? doGia : 0.0);
        this.ngaySanXuat = (ngaySanXuat == null) ? LocalDate.now() : ngaySanXuat;
        if (ngayHetHan == null || !ngayHetHan.isAfter(this.ngaySanXuat)) {
            this.ngayHetHan = this.ngaySanXuat.plusDays(1);
        } else {
            this.ngayHetHan = ngayHetHan;
        }
    }

    public String getTenHang() { return tenHang; }

    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.trim().isEmpty()) {
            this.tenHang = "No Name";
        } else {
            this.tenHang = tenHang.trim();
        }
    }

    public double getDonGia() { return donGia; }

    public void setDonGia(double doGia) {
        if (doGia <= 0) {
            this.donGia = 0;
        } else {
            this.donGia = doGia;
        }
    }

    public LocalDate getNgaySanXuat() { return ngaySanXuat; }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat == null) {
            this.ngaySanXuat = LocalDate.now();
        } else {
            this.ngaySanXuat = ngaySanXuat;
        }
        if (this.ngayHetHan == null || !this.ngayHetHan.isAfter(this.ngaySanXuat)) {
            this.ngayHetHan = this.ngaySanXuat.plusDays(1);
        }
    }

    public LocalDate getNgayHetHan() { return ngayHetHan; }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan == null || !ngayHetHan.isAfter(getNgaySanXuat())) {
            this.ngayHetHan = getNgaySanXuat().plusDays(1);
        } else {
            this.ngayHetHan = ngayHetHan;
        }
    }

    public boolean isHetHan() {
        return LocalDate.now().isAfter(ngayHetHan);
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-10s %-20s %18s %15s %15s %10s",
                maHang,
                tenHang,
                nf.format(donGia),
                ngaySanXuat.format(dtf),
                ngayHetHan.format(dtf),
                (isHetHan() ? "Hết hạn" : "Còn hạn"));
    }
}
