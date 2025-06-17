package ch06;

import java.util.Scanner;

public class StudentCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入身分 (學生 / 其他)：");
		String identity = scanner.next();

		System.out.print("請輸入年齡：");
		int age = scanner.nextInt();

		boolean isStudent = identity.equals("學生") ;
		boolean validAge = age >= 6 && age < 25;
		
		if (isStudent && validAge) {
			System.out.println("學生優惠通過！");
		} else {
			System.out.println("不符合學生優惠資格！");
		}
	}
}
