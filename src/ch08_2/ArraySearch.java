package ch08_2;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		int[] scores = { 80, 95, 70, 100, 65 };
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入你要搜尋的分數：");
		int target = scanner.nextInt();

		boolean found = false;
		for (int score : scores) {
			if (score == target) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("找到了！");
		} else {
			System.out.println("找不到這個分數");
		}
	}
}
