package ch08_1;

public class SquareFor {
	public static void main(String[] args) {
		// 宣告並初始化一個整數陣列
		int[] numbers = { 2, 4, 6, 8, 10 };

		// 用 for 迴圈印出所有成績
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] * numbers[i]);
		}
	}
}
