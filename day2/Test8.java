package day2;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// 隨堂練習:
		// 使用者只要輸入半徑, 就可以得到圓面積與球體積的結果
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入半徑:");
		double r = sc.nextDouble();
		double pi = Math.PI; // 3.1415926...

		double area = Math.pow(r, 2) * pi; // Math.pow(r, 2) => r * r

		double volume = 4.0/3 * pi * Math.pow(r, 3);

		System.out.printf("半徑: %.1f 圓面積: %.1f 球體績: %.1f %n", r, area, volume);
	}

}