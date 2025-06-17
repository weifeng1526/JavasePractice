package ch13;

public class ScoreCalculator {
	public static void main(String[] args) {
		System.out.println("整體平均：" + average(80, 90));
		System.out.println("小體平均：" + average(87.5, 92.0));
		System.out.println("三科平均：" + average(70, 85, 95));
	}

	// 方法重載：不同參數型別
	public static int average(int a, int b) {
		return (a + b) / 2;
	}

	public static double average(double a, double b) {
		return (a + b) / 2;
	}

	public static int average(int a, int b, int c) {
		return (a + b + c) / 3;
	}
}
