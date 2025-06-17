package ch06;

import java.util.Scanner;

public class AgeGroup {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入年齡：");
		int age = scanner.nextInt();

		if (age >= 0 && age <= 120) {
			if (age < 12) {
				System.out.println("你是孩童");
			} else if (age < 65) {
				System.out.println("你是成人");				
			} else {
				System.out.println("你是長者");
			}
		}else {
			System.out.println("年齡輸入不合理");
		} 
	}
}
