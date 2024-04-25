package day4;

import java.util.Scanner;
/**
活動推薦
輸入今日天氣（1:晴朗、2:多雲、3:陰天、4:下雨）：
若 1:晴朗 -> 外出打球
若 2:多雲 -> 外出散步
若 3:陰天 -> 外出散步
若 4:下雨 -> 在家寫程式
其他 -> 看書

請利用 switch-case 完成
*/

public class ActivityRecommend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入今日天氣（1:晴朗、2:多雲、3:陰天、4:下雨）： ");
		int weatherId = sc.nextInt();

		switch(weatherId) {
			case 1:
				System.out.print("外出打球");
				break;
			case 2:
			case 3:
				System.out.print("外出散步");
				break;
			case 4:
				System.out.print("在家寫程式");
				break;
			default:
				System.out.print("看書");
		}


		sc.close();
	}
}