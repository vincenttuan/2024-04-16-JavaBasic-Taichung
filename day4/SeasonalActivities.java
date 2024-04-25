package day4;

import java.util.Scanner;
/**
練習題：季節性活動推薦系統
你是一位Java程序員，負責開發一個簡單的應用程序，該程序根據用戶輸入的季節ID來推薦合適的季節性活動。

要求
編寫一個Java應用程序，使用 Scanner 類從用戶那裏獲取輸入：

用戶將輸入當前的季節（例如：1:"春"、2:"夏"、3:"秋"、4:"冬"）。

根據用戶輸入的季節ID，輸出對應的活動建議：
1 -> 春季：推薦去賞櫻。
2 -> 夏季：推薦去海邊游泳。
3 -> 秋季：推薦去登山賞楓葉。
4 -> 冬季：推薦去滑雪。

如果輸入不屬於這四個季節之一，則輸出提示信息請用戶重新輸入。

*/
public class SeasonalActivities { // 季節性活動
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入當前的季節（例如：1:春、2:夏、3:秋、4:冬）: ");

		int seasonId = sc.nextInt(); // 季節ID

		if(seasonId == 1) {
			System.out.println("春季：推薦去賞櫻。");
		} else if(seasonId == 2) {
			System.out.println("夏季：推薦去海邊游泳。");
		} else if(seasonId == 3) {
			System.out.println("秋季：推薦去登山賞楓葉。");
		} else if(seasonId == 4) {
			System.out.println("冬季：推薦去滑雪。");
		} else {
			System.out.println("季節輸入錯誤, 請重新輸入");
		}

		sc.close();

	}
}