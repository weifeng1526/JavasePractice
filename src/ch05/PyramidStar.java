package ch05;

import java.util.Scanner;

public class PyramidStar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入三角形的層數：");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			// 印空格
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// 印星星
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			// 換行
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			// 印空格
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
