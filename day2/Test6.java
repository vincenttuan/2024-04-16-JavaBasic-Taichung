package day2;

public class Test6 {

	public static void main(String[] args) {
		// 股價: 804, 張數: 10, 手續費率: 3‰, 交易稅率: 1.425‰ 
		double price = 804;
		int shares = 10;
		double feeRate = 3.0/1000;
		double taxRate = 1.425/1000;

		double value = price * 1000 * shares; // 市場價值
		double fee = value * feeRate; // 手續費
		double tax = value * taxRate; // 交易稅

		double cost = value + fee + tax; // 交易總成本

		System.out.printf("市值: %,.1f%n", value);
		System.out.printf("手續費: %,.1f%n", fee);
		System.out.printf("交易稅: %,.1f%n", tax);
		System.out.printf("交易總成本: %,.1f%n", cost);

	}

}