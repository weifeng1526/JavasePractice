package ch06;

import java.util.Scanner;

// 範例 1 ：分數合法且通過判斷
public class ScoreCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入分數 (0~100)：");
		int score = scanner.nextInt();
		
		if (score >= 0 && score <= 100) {
			if (score >= 60) {
				System.out.println("及格！");
			} else {
				System.out.println("不及格！");
			}
		} else {
			System.out.println("分數超出合理範圍！");
		}
	}
}