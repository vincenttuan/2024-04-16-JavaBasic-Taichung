package day4;

import java.util.Scanner;
/**
練習題：餐廳訂位系統
你被任命為一家餐廳的軟件開發者，需要寫一個Java程序來幫助餐廳管理訂位情況。
程序的目標是根據顧客的人數和每人預算來決定訂位的類型。

要求
編寫一個Java應用程序，使用 Scanner 類從用戶那裏獲取兩個輸入：

1.顧客的人數 (numberOfPeople)
2.每人的預算 (budgetPerPerson)

根據以下條件提供訂位選擇：

A.如果顧客人數超過4人：
	若每人預算不少於500元，輸出："安排豪華包廂"
	若每人預算不少於300元，輸出："安排普通包廂"
	否則，顯示："無法提供包廂，轉為考慮餐桌座位"，然後根據預算：
		若預算不少於200元，輸出："推薦高級餐桌"
		否則，輸出："推薦普通餐桌"

B.如果顧客人數不超過4人：
	若每人預算不少於300元，輸出："推薦高級餐桌"
	否則，輸出："推薦普通餐桌"

提示
	使用 System.out.print() 和 System.out.println() 來輸出提示和結果。
	確保使用 Scanner 類來接收用戶輸入，並在程序結束時關閉 Scanner 對象。

完成後，確保你的程序能夠處理不同的輸入情況並根據提供的條件正確輸出結果。

*/
public class RestaurantBooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 獲取顧客人數
		System.out.print("請輸入顧客人數(1~10):");
		int numberOfPeople = sc.nextInt();

		// 判斷顧客人數是否介於(1~10)
		if(numberOfPeople < 1 || numberOfPeople > 10) {
			System.out.println("顧客人數需在1~10之間");
			return;
		}

		// 獲取每人預算
		System.out.print("請輸入每人預算(100~1000):");
		int budgetPerPerson = sc.nextInt();

		// 判斷每人預算是否介於(100~1000)
		if(!(budgetPerPerson >= 100 && budgetPerPerson <= 1000)) {
			System.out.println("每人預算需在100~1000之間");
			return;
		}

		// 根據人數和預算做出訂位決策
		if(numberOfPeople >= 4) {

			if(budgetPerPerson >= 500) {
				System.out.println("安排豪華包廂");
			} else if(budgetPerPerson >= 300) {
				System.out.println("安排普通包廂");
			} else {
				System.out.println("無法提供包廂，轉為考慮餐桌座位");
				if(budgetPerPerson >= 200) {
					System.out.println("推薦高級餐桌");
				} else {
					System.out.println("推薦普通餐桌");
				}
			}			

		} else {

			if(budgetPerPerson >= 300) {
				System.out.println("推薦高級餐桌");
			} else {
				System.out.println("推薦普通餐桌");
			}

		}

		// 關閉
		sc.close();

	}

}