package ch08_2;

import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] scores = { 5, 10, 15, 20, 25 };
		Scanner scanner = new Scanner(System.in);

		// 印出陣列中所有數值
//		for (int score : scores) {
//			System.out.print(score + ", ");
//		}
		
		// 進階寫法(把逗號)指印在中間
		for (int i = 0; i < scores.length; i++) {
		    System.out.print(scores[i]);
		    if (i < scores.length - 1) {
		        System.out.print(", ");
		    }
		}

		// 計算總和平均
		int sum = 0;
		int max = scores[0];
		int min = scores[0];
		for (int score : scores) {
			sum += score;
		}
		double avg = (double) sum / scores.length;

		// 尋找最高最低分數
		for (int score : scores) {
			if (score > max) {
				max = score;
			}
			if (score < min) {
				min = score;
			}
		}
		System.out.println("\n總和：" + sum);
		System.out.println("平均：" + avg);
		System.out.println("最高分：" + max);
		System.out.println("最低分：" + min);

		// 搜尋分數是否在陣列中
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
			System.out.println("存在於陣列中！");
		} else {
			System.out.println("不存在於陣列中！");
		}
	}
}
