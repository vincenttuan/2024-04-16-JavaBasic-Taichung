package day5;

import java.util.Random;
import java.util.Scanner;

// 猜數字遊戲(1~9)
// 賓果, 猜大了, 猜小了
public class WhileDemo4 {
	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(9) + 1; // 0~8 + 1

		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("請在1~9猜一數字:");
			int guess = scanner.nextInt();
			if(guess > ans) {
				System.out.println("猜大了");
				continue; // 迴圈重跑
			} else if(guess < ans) {
				System.out.println("猜小了");
				continue; // 迴圈重跑
			} else {
				System.out.println("猜對了");
				break; // 跳離迴圈
			}
		}

	}
}