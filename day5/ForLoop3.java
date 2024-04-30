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
public class ForLoop3 {

	public static void main(String[] args) {
		int x = 1;
		//----------------------------------------------
		for(int y=1;y<=9;y++) {
			System.out.printf("%d*%d=%d ", x, y, (x*y));
		}
		System.out.println(); // 換行
		//----------------------------------------------
	}

}