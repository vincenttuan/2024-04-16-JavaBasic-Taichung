package day5;

import java.util.Random;
import java.util.Scanner;

// 請在 0~100 之間猜一個數字
// 要提供猜數字範圍
public class WhileDemo5 {
	public static void main(String[] args) {
		Random random = new Random();
		int min = 0;
		int max = 100;
		int ans = random.nextInt(99) + 1; // 0~98 + 1
		//int ans = random.nextInt(max - min - 1) + 1 + min;

		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("請在 %d~%d 之間猜一個數字:", min, max);
			int guess = scanner.nextInt();
			if(guess < ans) {
				min = guess;
				continue;
			} else if(guess > ans) {
				max = guess;
				continue;
			} else {
				System.out.println("猜對了");
				break;
			}
		}

	}
}