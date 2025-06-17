package ch08_2;

public class ArraySumAvg {
	public static void main(String[] args) {
		int[] scores = { 80, 95, 70, 100, 65 };

		int sum = 0;
		for (int score : scores) {
			sum += score; // 逐個累加，sum = sum + score
		}

		double avg = (double) sum / scores.length; //強制轉型才能得到小數結果

		System.out.println("總和：" + sum);
		System.out.println("平均：" + avg);
	}
}
