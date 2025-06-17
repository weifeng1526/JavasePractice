package ch12;

public class StudentScoreAnalyzer {
	public static void main(String[] args) {
		String[] names = {"小明", "小美", "阿華"};
		String[] subjects = {"國文", "英文", "數學"};
		int[][] scores = {
				{90, 80, 70},
				{85, 88, 92},
				{78, 75, 80}			
		};
		
		printAllScores(names, subjects, scores);
		printSubjectAverages(scores, subjects);
		printTopStudent(names,scores);
	}

	// 印出所有科目分數
	// 每位學生
	private static void printAllScores(String[] names, String[] subjects, int[][] scores) {
		System.out.println("學生成績：");
		for (int i = 0; i < scores.length; i++) {
			int total = 0;
			System.out.print(names[i] + "：");
			for (int j = 0; j < subjects.length; j++) {
				System.out.print(subjects[j] + " " + scores[i][j] + " ");
				total += scores[i][j];
			}
			double avg = (double) total / scores[i].length;
			System.out.printf("| 總分：%d 平均：%.2f%n", total, avg);
			
		}
		System.out.println();
	}
	
	// 印出所有科目的平均
	private static void printSubjectAverages(int[][] scores, String[] subjects) {
		System.out.println("各科目平均：");
		for (int j = 0; j < subjects.length; j++) {
			int sum = 0;
			for (int i = 0; i < scores.length; i++) {
				sum += scores[i][j];
			}
			double avg = (double) sum / scores.length;
			System.out.printf("%s：%.2f%n", subjects[j], avg);
		}
		System.out.println();
	}	
	
	// 找出總分最高的學生
	private static void printTopStudent(String[] names, int[][] scores) {
		int maxTotal = 0;
		int topIndex = 0;
		
		for (int i = 0; i < scores.length; i++) {
			int total = 0;
			for (int j = 0; j < scores[i].length; j++) {
				total += scores[i][j];
			}
			if (total > maxTotal) {
				maxTotal = total;
				topIndex = i;
			}
		}
		
		System.out.println("總分最高的學生是：" + names[topIndex] + "，總分：" + maxTotal);
	}	
}
