package day2;

// 變數的應用
public class Test5 {
	public static void main(String[] args) {
		// 計算 bmi
		double h = 170.0/100;
		double w = 60.0;
		double bmi = w / (h * h);

		System.out.println("身高: " + (h * 100) + " cm");
		System.out.println("體重: " + w + " kg");
		System.out.println("BMI: " + bmi);

		// 格式化
		// 浮點數: %f
		// 整數: %d
		// 字串: %s
		// 換行: %n 或 \n
		// 要使用 printf
		System.out.printf("身高: %.1f%n", h*100);
		System.out.printf("體重: %.1f%n", w);
		System.out.printf("BMI: %.2f%n", bmi);


	}
}