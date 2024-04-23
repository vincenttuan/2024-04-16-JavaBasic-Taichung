package day3;

import java.util.Scanner;
/**
 * 寫一個基礎代謝率(BMR)計算機
 * 使用者輸入性別、年齡、身高、體重可以得到 BMR 值
 * 公式:
 * 男性: BMR = 66 + (13.7 * 體重(kg)) + (5 * 身高(cm)) - (6.8 * 年齡)
 * 女性: BMR = 655 + (9.6 * 體重(kg)) + (1.8 * 身高(cm)) - (4.7 * 年齡)
 */
public class Demo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("請輸入性別(1:男, 2:女): ");
		int gender = sc.nextInt();

		System.out.print("請輸入年齡: ");
		int age = sc.nextInt();

		System.out.print("請輸入身高(cm): ");
		double h = sc.nextInt();

		System.out.print("請輸入體重(kg): ");
		double w = sc.nextInt();

		double bmr = 0;

		// 根據性別計算 BMR
		if(gender == 1) { // 男
			bmr = 66 + (13.7 * w) + (5 * h) - (6.8 * age);
		} else if (gender == 2) { // 女
			bmr = 655 + (9.6 * w) + (1.8 * h) - (4.7 * age);
		} else {
			System.out.print("輸入性別無效");
			return; // 提前結束此程序/方法
		}

		// 顯示結果
		System.out.printf("性別:%d 年齡:%d 身高:%.1f 體重:%.1f BMR:%,.2f%n", 
			gender, age, h, w, bmr);
	}

}