package ch06;

import java.util.Scanner;

public class RangeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入第一個整數：");
		int number1 = scanner.nextInt();
		
		System.out.print("請輸入第二個整數：");
		int number2 = scanner.nextInt();
		
		final int MIN = 15;		
		final int MAX = 99;
		
		
		if (number1 >= MIN && number1 <= MAX && number2 >= MIN && number2 <= MAX) {
			System.out.println("合法配對");
		} else {
			System.out.println("不合法");
		}
	}
}
