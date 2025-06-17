package ch03;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入分數(0~100)：");
		int score = scanner.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("輸入錯誤，請輸入 0 到 100 之間的分數！");
		} else if (score >= 90) {
			System.out.println("等級A");
		} else if (score >= 80) {
			System.out.println("等級B");
		} else if (score >= 70) {
			System.out.println("等級C");
		} else if (score >= 60) {
			System.out.println("等級D");
		} else {
			System.out.println("等級F");
		}
	}
}
