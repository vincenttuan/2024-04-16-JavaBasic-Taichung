package day5;

import java.util.Random;

public class WhileDemo2 {

	public static void main(String[] args) {
		Random random = new Random();
		boolean stop = false;

		while(!stop) {
			int n = random.nextInt(100);
			System.out.println(n);

			if(n == 77) {
				stop = true;
			}

		}


	}

}