package ch06;

import java.util.Scanner;

public class MultipleCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入一個整數：");
		int num = scanner.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("是 3 或 5 的公倍數");
		} else if (num % 3 == 0 || num % 5 == 0) {
			System.out.println("是 3 或 5 的倍數");
		} else {
			System.out.println("不是 3 或 5 的倍數");
		}
	}
}
