package day3;

import java.util.Scanner;

/**
	寫一個 BMI 計算機
	使用者輸入身高,體重可以得到 bmi 值
	並得到診斷結果:
			
	過輕 | 正常 | 過重
	    18     23
*/
public class Demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高:");
		double h = sc.nextDouble();
		System.out.print("請輸入體重:");
		double w = sc.nextDouble();

		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f%n", h, w, bmi);

		// 診斷
		System.out.print("診斷: ");

		if(bmi > 23) {
			System.out.print("過重");
		} else if(bmi < 18) {
			System.out.print("過輕");
		} else {
			System.out.print("正常");
		}

	}

}