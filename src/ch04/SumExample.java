package ch04;

import java.util.Iterator;
import java.util.Scanner;

public class SumExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入一個整數：");
		int n = scanner.nextInt(); // 使用者輸入 n，例如 5

		int sum = 0; // 初始化總和為 0

		// while寫法
//		int i = 1;   // 初始化計數器變數 i 為 1
//		while (i <= n) {
//			sum = sum + i; // 或寫成 sum += i
//			i++;		   // 每次執行後 i 加 1
//		}
//		System.out.println("總合為 " + sum);

		// for寫法
		for (int i = 1; i <= n; i++) {
			sum += i;  // 等同於 sum = sum + i
		}
		System.out.println("總合為 " + sum);
	}
}
