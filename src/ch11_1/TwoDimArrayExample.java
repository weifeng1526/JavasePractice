package ch11_1;

public class TwoDimArrayExample {
	public static void main(String[] args) {
		// 建立 3x3 的二維陣列
		int[][] grid = { 
			{ 1, 2, 3 }, 
			{ 4, 5, 6 }, 
			{ 7, 8, 9 } 
		};
		
		// 使用巢狀迴圈印出這個表格
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + "\t"); // \t 為 tab 對齊
			}
			System.out.println(); // 換行
		}
	}
}
