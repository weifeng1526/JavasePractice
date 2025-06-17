package ch08_1;

public class ArrayExample {
	public static void main(String[] args) {
		// 宣告並初始化一個整數陣列
		int[] scores = { 90, 85, 78, 92, 88 };

		// 用 for 迴圈印出所有成績
		for (int i = 0; i < scores.length; i++) {
			System.out.println("第 " + (i + 1) + " 位同學的成績" + scores[i]);
		}
	}
}
