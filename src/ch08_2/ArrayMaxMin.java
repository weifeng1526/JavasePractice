package ch08_2;

public class ArrayMaxMin {
	public static void main(String[] args) {
		int[] scores = { 80, 95, 70, 100, 65 };

		int max = scores[0];
		int min = scores[0];

		for (int score : scores) {
			if (score > max) {
				max = score;
			}
			if (score < min) {
				min = score;
			}
		}
		
		System.out.println("最高分：" + max);
		System.out.println("最低分：" + min);
	}
}
