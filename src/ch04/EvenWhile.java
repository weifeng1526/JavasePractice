package ch04;

import java.util.Scanner;

public class EvenWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入一個整數：");
		int n = scanner.nextInt();

		// while 寫法
//		int i = 1;
//		while (i <= n) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;  // 記得每次要 i++，不然會變無限迴圈！
//		}

		// for 寫法
//		// 方法A
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 方法B
//		for (int i = 2; i <= n; i += 2) {
//			System.out.println(i);
//		}
	}
}
