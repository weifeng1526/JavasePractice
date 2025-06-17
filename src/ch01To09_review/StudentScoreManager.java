package ch01To09_review;

import java.util.Scanner;

public class StudentScoreManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1. 輸入學生數
		System.out.print("請輸入學生人數：");
		int count = scanner.nextInt();
		scanner.nextLine(); // 清除換行符號
		/**
		 * 當你用 scanner.nextInt() 或 scanner.nextDouble() 讀入數字時，
		 * 它只會讀取數字本身，不會吃掉輸入後按下的「Enter」鍵（\n 換行符號）。 這個「Enter」會殘留在輸入緩衝區（input buffer），
		 * 下一次你用 nextLine() 想讀文字時，它就會直接讀到這個換行符號， 導致你拿到一個空字串 ""。
		 */

		// 2. 建立陣列
		String[] names = new String[count];
		int[] scores = new int[count];

		// 3. 輸入資料
		for (int i = 0; i < count; i++) {
			System.out.print("請輸入第" + (i + 1) + "位學生的名字：");
			names[i] = scanner.nextLine();

			System.out.print("請輸入" + names[i] + "的成績：");
			scores[i] = scanner.nextInt();
			scanner.nextLine(); // 清除換行
		}

		// 4. 印出所有學生
		System.out.println("\n=== 所有學生成績 ===");
		for (int i = 0; i < count; i++) {
			System.out.println(names[i] + "：" + scores[i]);
		}

		// 5. 計算總和、平均、最高最低
		int sum = 0;
		int max = scores[0];
		int min = scores[0];

		for (int score : scores) {
			sum += score;
			if (score > max) max = score;
			if (score < min) min = score;
		}
		
		double avg = (double) sum / count;
		
		System.out.println("\n總分：" + sum);
		System.out.printf("平均：%.2f\n：", avg);
		System.out.println("最高分：" + max);
		System.out.println("最低分：" + min);
		
		
		// 6. 搜尋特定分數
		System.out.println("\n請輸入一個分數來搜尋");
		int targetScore = scanner.nextInt();
		boolean foundScore = false;
		
		for (int score : scores) {
			if (score == targetScore) {
				foundScore = true;
				break;
			}
		}
		
		if (foundScore) {
			System.out.println("有學生的分數是 "+ targetScore +"！");
		} else {
			System.out.println("沒有學生的分數是 "+ targetScore);
		}
		
		scanner.nextLine(); // 清除換行符號
		
		// 7. 搜尋學生名字
		System.out.println("\n請輸入要查詢的學生名字：");
		String searchName = scanner.nextLine();
		boolean foundName = false;
		
		for (int i = 0; i < count; i++) {
			if (names[i].equals(searchName)) {
				System.out.println(searchName + "的成績是" + scores[i]);
				foundName = true;
				break;
			}
		}
		
		if (!foundName) {
			System.out.println("找不到該學生！");
		}
		
		scanner.close();
	}
}
