package chuong3;

public class bai1 {
private double ChieuDai;
private double ChieuRong;
public bai1(double chieuDai2, double chieuRong2) {
setChieuDai(chieuDai2);
setChieuRong(chieuRong2);
}
public double getChieuDai() {
	return ChieuDai;
}
public void setChieuDai(double chieuDai) {
	if(chieuDai < ChieuRong) {
		 System.out.println("Chiều dài nhỏ hơn chiều rộng !");
	}
	
	ChieuDai = chieuDai;
}
public double getChieuRong() {
	return ChieuRong;
}
public void setChieuRong(double chieuRong) {
	if(chieuRong > ChieuDai) {
		 System.out.println("Chiều rộng lớn hơn chiều dài!");
	}
	
	ChieuRong = chieuRong;
}
public double DienTich() {
	return ChieuDai*ChieuRong;
}
public double Chuvi() {
	return (ChieuDai + ChieuRong) * 2;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "chieu dai = " + ChieuDai +" | " + 
				"chieu rong = " + ChieuRong +" | "+
				"Dien Tich = " + DienTich() +" | "+
				"Chu Vi = " + Chuvi();
				
	}
}
