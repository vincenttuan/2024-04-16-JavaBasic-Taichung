package day5;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(9) + 1; // 0~8 + 1

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("玩家 0~9 猜一數字: ");
			int playerGuess = scanner.nextInt();
			if(playerGuess > ans) {
				System.out.println("玩家猜大了");
			} else if(playerGuess < ans) {
				System.out.println("玩家猜小了");
			} else {
				System.out.println("玩家答對了, 玩家勝利~");
				break;
			}
			//-----------------------------------------------
			int pcGuess = random.nextInt(9) + 1; // 0~8 + 1 猜一個數字
			System.out.printf("電腦 0~9 猜一數字: %d%n", pcGuess);
			if(pcGuess > ans) {
				System.out.println("電腦猜大了");
			} else if(pcGuess < ans) {
				System.out.println("電腦猜小了");
			} else {
				System.out.println("電腦答對了, 電腦勝利~");
				break;
			}

		} while(true);


	}

}