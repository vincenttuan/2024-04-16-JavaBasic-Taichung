package day4;

import java.util.Scanner;
// 學生分數評等系統
// 90~100 A
// 80~89  B
// 70~79  C
// 60~69  D
// 0~60   F
public class GradeSystem {

	public static void main(String[] args) {
		// 改成使用者可以自行輸入分數
		// 提示:使用 Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數: ");
		int score = sc.nextInt();

		System.out.printf("成績: %d%n", score);
		if(score >= 90 && score <= 100) {
			System.out.println("等級 A: 優秀");
		} else if(score >= 80 && score < 90) {
			System.out.println("等級 B: 良好");
		} else if(score >= 70 && score < 80) {
			System.out.println("等級 C: 中等");
		} else if(score >= 60 && score < 70) {
			System.out.println("等級 D: 及格");
		} else if (score >= 0 && score < 60){
			System.out.println("等級 F: 不及格");
		} else {
			System.out.println("分數範圍(0~100)錯誤!");
		}
	}

}