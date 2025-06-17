package ch12;

public class ScoreAnalyzer {
	public static void main(String[] args) {
		// 模擬三位學生的分數
		int[] scores = {85, 92, 76, 88, 95};
		
		// 呼叫printScores方法
		printScores(scores);
		
		// 呼叫計算總分的方法
		int total = getTotal(scores);
		System.out.println("總分：" + total);
		
		// 呼叫平均方法
		double avg = getAverage(scores);
		System.out.printf("平均：%.2f%n", avg);
		
		// 呼叫找出最高分的方法
		int max = getMaxScore(scores);
	}

	// 方法區塊
	// 印出所有分數
	private static void printScores(int[] scores) {
		System.out.print("所有分數：");
		for (int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
	}
	
	// 計算總和
	private static int getTotal(int[] scores) {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return sum;
	}
	
	// 計算平均
	private static double getAverage(int[] scores) {
		return (double) getTotal(scores) / scores.length;
	}
	
	// 找出最高分
	private static int getMaxScore(int[] scores) {
		int max = scores[0];
		for (int score : scores) {
			if (score > max) {
				max = score;
			}
		}
		return max;
	}
}
