package ch08_1;

public class SquareForEach {
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8, 10 };

		for (int num : numbers) {
			System.out.println(num * num);
		}
	}
}
