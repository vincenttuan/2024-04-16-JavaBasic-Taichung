package day5;

/** 
	九九乘法表
	x y
	1*1=1 1*2=2  ... 1*9=9
	2*1=2 2*2=4  ... 2*9=18
	3*1=3 3*2=6  ... 3*9=27
	...
	9*1=9 9*2=18 ... 9*9=81
*/
public class ForLoop4 {

	public static void main(String[] args) {
		
		int total = 0;
		
		for(int x=1;x<=9;x++) {

			//----------------------------------------------
			for(int y=1;y<=9;y++) {
				int sum = x*y; // 乘積
				System.out.printf("%d*%d=%2d ", x, y, sum);
				total += sum; // 累加 total = total + sum
			}
			System.out.println(); // 換行
			//----------------------------------------------

		}

		System.out.printf("總和: %,d%n", total);

	}

}