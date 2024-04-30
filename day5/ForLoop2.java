package day5;

import java.util.Random;

public class ForLoop2 {

	public static void main(String[] args) {
		// 四星彩電腦選號
		Random random = new Random();
		System.out.print("四星彩電腦選號 => ");
		for(int i=0;i<4;i++) {
			int n = random.nextInt(10); // 0~9
			System.out.print(n);
		}
	}
}