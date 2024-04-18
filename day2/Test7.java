package day2;

import java.util.Scanner;

// 變數應用與簡易的輸入(Scanner)
public class Test7 {

	public static void main(String[] args) {
		// 建立一個簡易版輸出與輸入物件
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高(cm):");
		double h = sc.nextDouble(); // 取得使用者在鍵盤中所輸入的資料 
		System.out.print("請輸入體重(kg):");
		double w = sc.nextDouble(); // 取得使用者在鍵盤中所輸入的資料 
		// 計算 BMI
		h = h / 100; // 身高的公分變為公尺
		double bmi = w / (h*h);

		System.out.printf("身高:%.1f 體重:%.1f BMI:%.2f%n", h*100, w, bmi);
	}

}