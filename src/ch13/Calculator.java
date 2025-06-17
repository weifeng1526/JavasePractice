package ch13;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("兩個整數相加為：" + add(80, 90));
		System.out.println("三個整數相加為：" + add(80, 90, 100));
		System.out.println("兩個浮點數相加為：" + add(80.5, 90.6));
	}
	
	// 加總兩個整數
	public static int add(int a, int b) {
		return a + b;
	}
	
	// 加總三個整數
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// 加總兩個浮點數
	public static double add(double a, double b) {
		return a + b;
	}
	
	
	
}
