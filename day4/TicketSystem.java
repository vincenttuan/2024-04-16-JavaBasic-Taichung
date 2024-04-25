package day4;

import java.util.Scanner;

/**
練習題：電影院票價和座位選擇系統
你負責開發一個電影院的票務系統，該系統需要根據顧客的年齡和觀影時間來決定票價和座位類型。

要求
編寫一個Java應用程序，使用 Scanner 類從用戶那裏獲取兩個輸入：

1.顧客的年齡 (age)
2.觀影時間（24小時制，如：15代表15:00） (hour)

根據以下條件提供票價和座位類型：

A.如果是黃金時段（18:00至22:00，即18 <= hour < 22）：
	若顧客是兒童（12歲及以下），票價為8元，輸出："兒童票：8元，普通座"
	若顧客是成人（13至64歲），票價為12元，輸出："成人票：12元，優選座"
	若顧客是長者（65歲以上），票價為10元，輸出："長者票：10元，優選座"

B.如果不是黃金時段：
	若顧客是兒童，票價為5元，輸出："兒童票：5元，普通座"
	若顧客是成人，票價為10元，輸出："成人票：10元，普通座"
	若顧客是長者，票價為8元，輸出："長者票：8元，普通座"

提示:
1.使用 System.out.print() 和 System.out.println() 來輸出提示和結果。
2.確保使用 Scanner 類來接收用戶輸入，並在程序結束時關閉 Scanner 對象。

完成後，確保你的程序能夠處理不同的輸入情況並根據提供的條件正確輸出結果。

*/
public class TicketSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 獲取顧客年齡
        System.out.print("請輸入顧客年齡: ");
        int age = sc.nextInt();
        // 獲取觀影時間
        System.out.print("請輸入觀影時間（24小時制，如15代表15:00）: ");
        int hour = sc.nextInt();

        // 根據時間和年齡決定票價和座位類型
        if(hour >=18 && hour < 22) { // 黃金時段
        	if(age <= 12) {
        		System.out.println("兒童票：8元，普通座");
        	} else if(age >= 13 && age <= 64) {
        		System.out.println("成人票：12元，優選座");
        	} else { // age >= 65
        		System.out.println("長者票：10元，優選座");
        	}

        } else { // 非黃金時段
        	if(age <= 12) {
        		System.out.println("兒童票：5元，普通座");
        	} else if(age >= 13 && age <= 64) {
        		System.out.println("成人票：10元，普通座");
        	} else { // age >= 65
        		System.out.println("長者票：8元，普通座");
        	}
        }

        // 關閉
        sc.close();
	}
}