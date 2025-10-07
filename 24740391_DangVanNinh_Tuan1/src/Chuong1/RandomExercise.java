package Chuong1;

import java.util.Random;

public class RandomExercise {
	public static void main(String[] args) {
		Random rd = new Random();
		
		for (int i =0; i<10;i++) {
			int n = rd.nextInt(10);
		System.out.println("Number " + (i + 1) + ": " + n);
		}
		}
		}
