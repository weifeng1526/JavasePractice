package ch11_1;

import java.util.Scanner;

public class StudentScoresLits {
	public static void main(String[] args) {
		// 建立 3x3 的二維陣列
		int[][] scores = { 
			{90, 85, 78},
			{76, 88, 85},
			{92, 91, 90},
			{70, 65, 72}
		};
		
		// 初始化總分與第幾位學生
		int maxTotal = 0;
		int maxIndex = 0;

		String[] names = {"學生 1", "學生 2", "學生 3", "學生 4"};
		
		// 初始化科目
		int chineseTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;

		for (int i = 0; i < scores.length; i++) {
			int total = 0;
			System.out.print("學生 " + (i + 1) + "：");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				total += scores[i][j];				
			}
			if (total > maxTotal) {
				maxTotal = total; //更新最高總分
				maxIndex = i;     // 記住是第幾位學生
			}
			System.out.println("| " + "總和：" + total);
		}
		
		final int CHINESE = 0, ENGLISH = 1, MATH = 2;
		// 每個科目的總和
		for (int i = 0; i < scores.length; i++) {
			chineseTotal += scores[i][CHINESE]; //國文
			englishTotal += scores[i][ENGLISH]; //英文
			mathTotal += scores[i][MATH]; 	  //數學
		}
		
		// 計算各科平均
		double chineseAvg = (double) chineseTotal / scores.length;
		double englishAvg = (double) englishTotal / scores.length;
		double mathAvg = (double) mathTotal / scores.length;
		
		// 輸出各科平均
		System.out.printf("\n國文平均：%.2f%n", chineseAvg);
		System.out.printf("英文平均：%.2f%n", englishAvg);
		System.out.printf("數學平均：%.2f%n", mathAvg);
		
		// 最高分學生
		System.out.println("\n總分最高的學生是：" + names[maxIndex]);
		System.out.println("總分為：" + maxTotal + "\n");

		// 最低平均科目
		if (chineseAvg <= englishAvg && chineseAvg <= mathAvg) {
			System.out.println("國文的平均分數最低：" + chineseAvg);
		} else if (englishAvg <= chineseAvg && englishAvg <= mathAvg) {
			System.out.println("英文的平均分數最低：" + englishAvg);
		} else {
			System.out.println("數學的平均分數最低：" + mathAvg);
		}
	}
}
