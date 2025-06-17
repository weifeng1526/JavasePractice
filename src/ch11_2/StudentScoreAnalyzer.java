package ch11_2;

import java.util.Scanner;

public class StudentScoreAnalyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/**
		 * 首先輸入學生與科目數量 >> 
		 * 輸入有哪些科目(科目名稱) >> 
		 * 輸入學生資訊(姓名、各科成績) >> 
		 * 計算每位學生總分、平均，及最高分 >>
		 * 顯示各科目平均 >> 
		 * 顯示最高分學生與其資訊
		 */
		// 輸入學生人數與科目
		System.out.print("請輸入學生人數：");
		int studentCount = scanner.nextInt();

		System.out.print("請輸入科目數：");
		int subjectCount = scanner.nextInt();
		scanner.nextLine();

		// 輸入各科目名稱
		String[] subjectNames = new String[subjectCount];
		System.out.println("請輸入科目名稱：");
		for (int i = 0; i < subjectCount; i++) {
			System.out.print("第 " + (i + 1) + " 科目：");
			subjectNames[i] = scanner.nextLine();
		}

		// 建立學生姓名與成績陣列
		String[] names = new String[studentCount];
		int[][] scores = new int[studentCount][subjectCount];

		// 輸入學生名字與各科成績，走訪每位學生
		for (int i = 0; i < studentCount; i++) {
			System.out.print("\n請輸入第 " + (i + 1) + " 位學生姓名： ");
			names[i] = scanner.nextLine();

			// 輸入各科成績，走訪每科
			for (int j = 0; j < subjectCount; j++) {
				System.out.print(subjectNames[j] + " 成績：");
				scores[i][j] = scanner.nextInt();
			}
			scanner.nextLine();
		}

		// 分析成績
		int maxTotal = 0, maxIndex = 0;
		int[] subjectTotals = new int[subjectCount];

		System.out.println("\n=== 學生各科成績 ===");
		for (int i = 0; i < studentCount; i++) {
			int total = 0;
			System.out.print(names[i] + "：");
			for (int j = 0; j < subjectCount; j++) {
				System.out.print(scores[i][j] + "\t");
				total += scores[i][j];
				subjectTotals[j] += scores[i][j];
			}
			// 成績平均
			double avg = (double) total / subjectCount;
			// 輸出成績總分與平均
			System.out.printf("| 總分：%d 平均：%.2f%n", total, avg);

			// 尋找最高分
			if (total > maxTotal) {
				maxTotal = total;
				maxIndex = i;
			}
		}
		// 各科平均
		System.out.println("\n各科目平均");
		for (int j = 0; j < subjectCount; j++) {
			double avg = (double) subjectTotals[j] / studentCount;
			System.out.printf("%s：%.2f%n", subjectNames[j], avg);
		}

		System.out.println("\n最高分學生： " + names[maxIndex] + "，總分：" + maxTotal + "\n" + names[maxIndex] + "各科成績如下：");
		for (int j = 0; j < subjectCount; j++) {
			System.out.print(subjectNames[j] + "：" + scores[maxIndex][j] + "\n");
		}

		scanner.close();
	}
}
