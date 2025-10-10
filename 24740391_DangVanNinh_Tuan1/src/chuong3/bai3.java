package chuong3;

public class bai3 {
private String Chuxe;
private String Loaixe;
private int Dungtich;
private double Trigia;
public bai3() {
	this.Chuxe = "NoName";
	this.Loaixe = "NoName";
	this.Dungtich = 0;
	this.Trigia = 0.0f;

}

public bai3(String chuxe, String loaixe, int dungtich, double trigia, float thue) {
	
	Chuxe = chuxe;
	Loaixe = loaixe;
	Dungtich = dungtich;
	Trigia = trigia;
}
public String getChuxe() {
	return Chuxe;
}
public void setChuxe(String chuxe) {
	Chuxe = chuxe;
}
public String getLoaixe() {
	return Loaixe;
}
public void setLoaixe(String loaixe) {
	Loaixe = loaixe;
}
public int getDungtich() {
	return Dungtich;
}
public void setDungtich(int dungtich) {
	Dungtich = dungtich;
}
public double getTrigia() {
	return Trigia;
}
public void setTrigia(float trigia) {
	Trigia = trigia;
}
public double tinhThue() {
    if (Dungtich < 100)
        return Trigia * 0.01;
    else if (Dungtich <= 200)
        return Trigia * 0.03;
    else
        return Trigia * 0.05;
}

@Override
public String toString() {
    return String.format("%-20s %-15s %10.2f %10d %15.2f",
            Chuxe, Loaixe, Trigia, Dungtich, tinhThue());
}
}