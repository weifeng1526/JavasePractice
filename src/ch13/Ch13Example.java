package ch13;

public class Ch13Example {
	public static void main(String[] args) {
		int result = add(10, 20);
		System.out.println("加總結果：" + result);

		System.out.println();
		sayHi();
		getScore();
		
		System.out.println();
		System.out.println(add(2, 3));         // 呼叫 int 版本
		System.out.println(add(2.5, 3.1));     // 呼叫 double 版本
		System.out.println(add(1, 2, 3));      // 呼叫三個 int 版本

	}

	// 1. 方法回傳值（Return Value）
	public static int add1(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	
	// 2. void vs 有回傳值的方法
	private static void sayHi() {
		System.out.println("嗨，你好！");
	}
	
	public static int getScore() {
		return 95;
	}
	
	
	// 3. 方法重載（Overloading）
	// 同名方法 + 不同參數（型別 or 數量） = 重載成功
	// 方法 overloading：根據參數決定使用哪一個
	public static int add(int a, int b) {
	    return a + b;
	}

	public static double add(double a, double b) {
	    return a + b;
	}

	public static int add(int a, int b, int c) {
	    return a + b + c;
	}
}
