package Chuong1;
import java.util.Random;
public class Bai10 {
	public static void main(String[] args) {
		Random rd = new Random();
		int count=0;
		int sum=0;
		
	for(int i=0; count < 10; i++) {
		int n = rd.nextInt(100);
			if( n%2==0) {
				System.out.println("cac so chan "+ i +":" + n);
				sum+=n;
				count++;
			}
		}
	System.out.println("Tổng của 10 số chẵn đầu tiên là: " + sum);
		}
	}

