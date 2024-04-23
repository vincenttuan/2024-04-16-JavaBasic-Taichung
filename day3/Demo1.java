package day3;

public class Demo1 {

	public static void main(String[] args) {
		// Java 的基本資料型別
		byte b = 5;
		short s = 500;
		int i = 100_0000;
		long l = 500_0000_0000L;

		float f = 3.14F; // 因為 3.14 預設是 double, 所以要加上 F 轉型
		double d = 5.82;

		char c1 = '巨';
		char c2 = 'H';
		char c3 = 65; // 65 會轉 ASCII Code 會得到 A
		char c4 = '\u0048'; // unicode 'H'

		boolean x = true;

		System.out.printf("b = %d%n", b);
		System.out.printf("s = %d%n", s);
		System.out.printf("i = %d%n", i);
		System.out.printf("l = %d%n", l);

		System.out.printf("f = %.2f%n", f);
		System.out.printf("d = %.2f%n", d);

		System.out.printf("c1 = %c%n", c1);
		System.out.printf("c2 = %c%n", c2);
		System.out.printf("c3 = %c%n", c3);
		System.out.printf("c4 = %c%n", c4);

		System.out.printf("x = %b%n", x);
	}

}