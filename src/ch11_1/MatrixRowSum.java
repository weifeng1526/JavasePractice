package ch11_1;

public class MatrixRowSum {
	public static void main(String[] args) {
		// 建立 3x3 的二維陣列
		int[][] matrix = { 
			{ 3, 5, 2 }, 
			{ 1, 4, 7 }, 
			{ 6, 8, 9 } 
		};

		for (int i = 0; i < matrix.length; i++) {
			int rowSum = 0; // 每列初始化
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
				rowSum += matrix[i][j];
			}
			System.out.println("| " + "總和：" + rowSum);
		}
	}
}
