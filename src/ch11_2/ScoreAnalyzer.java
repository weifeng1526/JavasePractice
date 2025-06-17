package ch11_2;

import java.util.Scanner;

public class ScoreAnalyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        // 輸入學生人數與科目數
		System.out.print("請輸入學生人數：");
		int studentCount = scanner.nextInt();
		
		System.out.print("請輸入科目數：");
		int subjectCount = scanner.nextInt();
		scanner.nextLine(); // 吃掉換行
		
		// 輸入每科名稱
		String[] subjectNames = new String[subjectCount];
		System.out.println("請輸入科目名稱：");
		for (int i = 0; i < subjectCount; i++) {
			System.out.println("第 " + (i + 1) + " 科：");
			subjectNames[i] = scanner.nextLine();
		}
		
		// 建立學生成績與姓名陣列
		int[][] scores = new int[studentCount][subjectCount];
		String[] names = new String[studentCount];
		
        // 輸入學生資料與成績，走訪每位學生
		for (int i = 0; i < studentCount; i++) {
			System.out.print("\n請輸入第 " + (i + 1) + " 位學生姓名：");
			names[i] = scanner.nextLine();
			
			// 依照科目數量，輸入該名學生成績，走訪每科
			for (int j = 0; j < subjectCount; j++) {
				System.out.print(subjectNames[j] + " 成績：");
				scores[i][j] = scanner.nextInt();
			}
			scanner.nextLine(); // 吃掉換行
		}
		
		// 成績分析
		// 宣告統計變數
		int maxTotal = 0, maxIndex = 0;
		int[] subjectTotals = new int[subjectCount];
		
		// 輸出每位學生的總分跟平均
		System.out.println("\n=== 成績報表 ===");
		for (int i = 0; i < studentCount; i++) {
			int total = 0;
			System.out.print(names[i] + "：");
			for (int j = 0; j < subjectCount; j++) {
				System.out.print(scores[i][j] + "\t");
				total += scores[i][j];
				subjectTotals[j] += scores[i][j]; // 各科累加
			}
			double avg = (double) total / subjectCount;
			System.out.printf("| 總分：%d 平均：%.2f%n", total, avg);
			
			if (total > maxTotal) {
				maxTotal = total;
				maxIndex = i;
			}
		}
		
		// 每科平均
		System.out.println("\n各科平均：");
		for (int j = 0; j < subjectCount; j++) {
			double avg = (double) subjectTotals[j] / studentCount;
			System.out.printf("%s：%.2f%n", subjectNames[j], avg);
		}
		
		System.out.println("\n總分最高學生：" + names[maxIndex] + "，總分：" + maxTotal);
		
		scanner.close();
	}
}
