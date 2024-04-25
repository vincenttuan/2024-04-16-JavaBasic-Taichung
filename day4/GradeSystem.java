package day4;

// 學生分數評等系統
// 90~100 A
// 80~89  B
// 70~79  C
// 60~69  D
// 0~60   F
public class GradeSystem {

	public static void main(String[] args) {
		int score = 82;

		System.out.printf("成績: %d%n", score);
		if(score >= 90) {
			System.out.println("等級 A: 優秀");
		} else if(score >= 80) {
			System.out.println("等級 B: 良好");
		} else if(score >= 70) {
			System.out.println("等級 C: 中等");
		} else if(score >= 60) {
			System.out.println("等級 D: 及格");
		} else {
			System.out.println("等級 F: 不及格");
		}
	}

}