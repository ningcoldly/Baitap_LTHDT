package chuong3;

public class bai2 {
private int Massv;
private String Ten;
private float DiemLT;
private float diemTH;

public bai2() {
	this(0,"NoName",0.0f, 0.0f);
}

public bai2(int massv, String ten, float diemLT, float diemTH) {
	
	this.Massv = massv;
	this.Ten = ten;
	this.DiemLT = diemLT;
	this.diemTH = diemTH;
}

public int getMassv() {
	return Massv;
}

public void setMassv(int massv) {
	Massv = massv;
}

public String getTen() {
	return Ten;
}

public void setTen(String ten) {

	Ten = ten;
}

public float getDiemLT() {
	return DiemLT;
}

public void setDiemLT(float diemLT) {
	DiemLT = diemLT;
}

public float getDiemTH() {
	return diemTH;
}

public void setDiemTH(float diemTH) {
	this.diemTH = diemTH;
}

public float DiemTB() {
	return (DiemLT + diemTH) /2;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("\"%-5s %-30s %10.2f %10.2f %10.2f\"",Massv, Ten, DiemLT, diemTH,DiemTB());
	}

}
